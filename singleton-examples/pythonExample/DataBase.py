class DataBase(object):
  def __new__(cls):
    if not hasattr(cls, 'instance'):
      cls.instance = super(DataBase, cls).__new__(cls)
    return cls.instance

data_base = DataBase()
data_base_second_instance = DataBase()

print(data_base is data_base_second_instance)
