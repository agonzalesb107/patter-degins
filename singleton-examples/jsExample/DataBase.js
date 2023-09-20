class DataBase {
  constructor() {}

  getConnection() {
    console.log("Connected to DB...");
  }
}

var DataBaseInstance = (function () {
  var instance;

  function createInstance() {
    var dataBaseInstance = new DataBase();
    return dataBaseInstance;
  }

  return {
    getInstance: function () {
      if (!instance) {
        instance = createInstance();
      } else {
        console.log("Db already created...");
      }
      return instance;
    },
  };
})();

var dataBase;
dataBase = DataBaseInstance.getInstance();
dataBase.getConnection();
dataBase = DataBaseInstance.getInstance();
