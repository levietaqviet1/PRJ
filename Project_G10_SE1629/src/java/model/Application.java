
package model;

/**
 *
 * @author 84399
 */
public class Application {
    private int id;
    private String appName;
    private String noidungapp;
    private int idsv;
    private String timeguidon;
    private String timeduyetdon;
    private int tinhtrangdonid;
    private String lido;

    public Application() {
    }

    public String getLido() {
        return lido;
    }

    public void setLido(String lido) {
        this.lido = lido;
    }

    public Application(int id, String appName, String noidungapp, int idsv, String timeguidon, String timeduyetdon, int tinhtrangdonid, String lido) {
        this.id = id;
        this.appName = appName;
        this.noidungapp = noidungapp;
        this.idsv = idsv;
        this.timeguidon = timeguidon;
        this.timeduyetdon = timeduyetdon;
        this.tinhtrangdonid = tinhtrangdonid;
        this.lido = lido;
    }
    
    

    public Application(int id, String appName, String noidungapp, int idsv, String timeguidon, String timeduyetdon, int tinhtrangdonid) {
        this.id = id;
        this.appName = appName;
        this.noidungapp = noidungapp;
        this.idsv = idsv;
        this.timeguidon = timeguidon;
        this.timeduyetdon = timeduyetdon;
        this.tinhtrangdonid = tinhtrangdonid;
    }

    public Application(String appName, String noidungapp, int idsv, String timeguidon, String timeduyetdon, int tinhtrangdonid) {
        this.appName = appName;
        this.noidungapp = noidungapp;
        this.idsv = idsv;
        this.timeguidon = timeguidon;
        this.timeduyetdon = timeduyetdon;
        this.tinhtrangdonid = tinhtrangdonid;
    }

    public Application(String appName, String noidungapp, int idsv, String timeguidon) {
        this.appName = appName;
        this.noidungapp = noidungapp;
        this.idsv = idsv;
        this.timeguidon = timeguidon;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getNoidungapp() {
        return noidungapp;
    }

    public void setNoidungapp(String noidungapp) {
        this.noidungapp = noidungapp;
    }

    public int getIdsv() {
        return idsv;
    }

    public void setIdsv(int idsv) {
        this.idsv = idsv;
    }

    public String getTimeguidon() {
        return timeguidon;
    }

    public void setTimeguidon(String timeguidon) {
        this.timeguidon = timeguidon;
    }

    public String getTimeduyetdon() {
        return timeduyetdon;
    }

    public void setTimeduyetdon(String timeduyetdon) {
        this.timeduyetdon = timeduyetdon;
    }

    public int getTinhtrangdonid() {
        return tinhtrangdonid;
    }

    public void setTinhtrangdonid(int tinhtrangdonid) {
        this.tinhtrangdonid = tinhtrangdonid;
    }

    @Override
    public String toString() {
        return "Application{" + "id=" + id + ", appName=" + appName + ", noidungapp=" + noidungapp + ", idsv=" + idsv + ", timeguidon=" + timeguidon + ", timeduyetdon=" + timeduyetdon + ", tinhtrangdonid=" + tinhtrangdonid + ", lido=" + lido + '}';
    }
    
    
    
    
}
