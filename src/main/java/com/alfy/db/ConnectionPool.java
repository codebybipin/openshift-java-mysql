package com.alfy.db;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 * Author: Alan Created: 12/13/2014.
 */
public class ConnectionPool {
  //// Singleton ////
  private static ConnectionPool instance;

  public static ConnectionPool getInstance() {
    if (instance == null) {
      instance = new ConnectionPool();
    }
    return instance;
  }
  //// Singleton ////

  private static final String DB_USERNAME = System.getenv("MYSQL_USER");
  private static final String DB_PASSWORD = System.getenv("MYSQL_PASSWORD");
  private static final String DB_DATABASE = System.getenv("MYSQL_DATABASE");
  private static final String DB_HOST = System.getenv("MYSQL_SERVICE_HOST");
  private static final String DB_PORT = System.getenv("MYSQL_SERVICE_PORT");
  private static final String DB_NAME = "java";
  private static final String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_DATABASE;
  private static final String DB_DRIVER = "com.mysql.jdbc.Driver";

  private BasicDataSource basicDataSource;

  private ConnectionPool() {
    basicDataSource = new BasicDataSource();
    basicDataSource.setDriverClassName(DB_DRIVER);

    basicDataSource.setUsername(DB_USERNAME);
    basicDataSource.setPassword(DB_PASSWORD);
    basicDataSource.setUrl(DB_URL);
    basicDataSource.setInitialSize(1);
  }

  public Connection getConnection() throws SQLException {
    return basicDataSource.getConnection();
  }
}
