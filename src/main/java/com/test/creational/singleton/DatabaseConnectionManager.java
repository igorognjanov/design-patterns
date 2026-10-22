package com.test.creational.singleton;

public class DatabaseConnectionManager {

    private static DatabaseConnectionManager databaseConnectionManager;
    private final Connection connection;

    public DatabaseConnectionManager() {
        this.connection = new Connection("TEST URL");
    }

    public static DatabaseConnectionManager getInstance() {
        if (databaseConnectionManager != null) {
            return databaseConnectionManager;
        } else {
            databaseConnectionManager = new DatabaseConnectionManager();
            return databaseConnectionManager;
        }
    }

    public Connection getConnection() {
        return connection;
    }

}
