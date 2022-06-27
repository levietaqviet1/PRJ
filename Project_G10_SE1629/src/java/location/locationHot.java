/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package location;

/**
 *
 * @author NCC
 */
public class locationHot {

    private String serverName;
    private String dbName;
    private String portNumber;
    private String userID;
    private String password;
    private String local;

//    public locationHot() {
//        // laptop
//        this.serverName = "localhost";
//        this.dbName = "PRJ_G10";
//        this.portNumber = "1433";
//        this.userID = "sa";
//        this.password = "123";
//        this.local = "9999";
//    }
    public locationHot() {
        // PC
        this.serverName = "DESKTOP-FOIPU4I";
        this.dbName = "PRJ_G10";
        this.portNumber = "1433";
        this.userID = "sa";
        this.password = "Viet2001";
        this.local = "8080";
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(String portNumber) {
        this.portNumber = portNumber;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
