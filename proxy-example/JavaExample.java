interface Platform {
  void access(String username);
}

class RealPlatform implements Platform {
  private String platformName;

  public RealPlatform(String platformName) {
      this.platformName = platformName;
      System.out.println("RealPlatform: Init " + platformName);
  }

  @Override
  public void access(String username) {
      System.out.println("RealPlatform: Access to " + platformName + " for user " + username);
  }
}

class PlatformProxy implements Platform {
  private RealPlatform realPlatform;
  private String platformName;

  public PlatformProxy(String platformName) {
      this.platformName = platformName;
  }

  @Override
  public void access(String username) {
      if (authenticateUser(username)) {
          if (realPlatform == null) {
              realPlatform = new RealPlatform(platformName);
          }
          realPlatform.access(username);
      } else {
          System.out.println("PlatformProxy: Access deny.");
      }
  }

  private boolean authenticateUser(String username) {
      return true;
  }
}

public class JavaExample {
  public static void main(String[] args) {
      Platform platform = new PlatformProxy("SocialMediaPlatform");
      platform.access("user123");

      platform.access("user456");
  }
}
