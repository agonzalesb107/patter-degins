interface ShapeVisitor {
  double visit(Circle circle);
  double visit(Rectangle rectangle);
  double visit(Triangle triangle);
}

interface Shape {
  double accept(ShapeVisitor visitor);
}

class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
      this.radius = radius;
  }

  public double getRadius() {
      return radius;
  }

  @Override
  public double accept(ShapeVisitor visitor) {
      return visitor.visit(this);
  }
}

class Rectangle implements Shape {
  private double width;
  private double height;

  public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
  }

  public double getWidth() {
      return width;
  }

  public double getHeight() {
      return height;
  }

  @Override
  public double accept(ShapeVisitor visitor) {
      return visitor.visit(this);
  }
}

class Triangle implements Shape {
  private double sideA;
  private double sideB;
  private double sideC;

  public Triangle(double sideA, double sideB, double sideC) {
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
  }

  public double getSideA() {
      return sideA;
  }

  public double getSideB() {
      return sideB;
  }

  public double getSideC() {
      return sideC;
  }

  @Override
  public double accept(ShapeVisitor visitor) {
      return visitor.visit(this);
  }
}

class AreaAndPerimeterCalculator implements ShapeVisitor {
  @Override
  public double visit(Circle circle) {
      return Math.PI * Math.pow(circle.getRadius(), 2);
  }

  @Override
  public double visit(Rectangle rectangle) {
      return rectangle.getWidth() * rectangle.getHeight();
  }

  @Override
  public double visit(Triangle triangle) {
      double s = (triangle.getSideA() + triangle.getSideB() + triangle.getSideC()) / 2;
      return Math.sqrt(s * (s - triangle.getSideA()) * (s - triangle.getSideB()) * (s - triangle.getSideC()));
  }
}

public class JavaExample {
  public static void main(String[] args) {
      Shape circle = new Circle(5.0);
      Shape rectangle = new Rectangle(4.0, 6.0);
      Shape triangle = new Triangle(3.0, 4.0, 5.0);

      AreaAndPerimeterCalculator calculator = new AreaAndPerimeterCalculator();

      double circleArea = circle.accept(calculator);
      double rectangleArea = rectangle.accept(calculator);
      double triangleArea = triangle.accept(calculator);

      System.out.println("Area of Circle: " + circleArea);
      System.out.println("Area of Rectangle: " + rectangleArea);
      System.out.println("Area of Triangle: " + triangleArea);
  }
}
