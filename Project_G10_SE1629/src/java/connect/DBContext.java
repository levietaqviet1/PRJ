package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import location.locationHot;

public class DBContext {

    /*USE BELOW METHOD FOR YOUR DATABASE CONNECTION FOR BOTH SINGLE AND MULTILPE SQL SERVER INSTANCE(s)*/
 /*DO NOT EDIT THE BELOW METHOD, YOU MUST USE ONLY THIS ONE FOR YOUR DATABASE CONNECTION*/
    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }

    /*Insert your other code right after this comment*/
 /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    locationHot LocationHot = new locationHot();
    private final String serverName = LocationHot.getServerName();
    private final String dbName = LocationHot.getDbName();
    private final String portNumber = LocationHot.getPortNumber();
    private final String userID = LocationHot.getUserID();
    private final String password = LocationHot.getPassword();
}
