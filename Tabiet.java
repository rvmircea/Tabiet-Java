import java.util.Date;

public class Tabiet {

    private Integer tabietId;

    private String tabietNume;

    private String tabietDesc;

    private Date tabietDataInce;

    private Integer tabietProgres;

    private String tabietStatus;

    private Integer badgeId;

    public Tabiet(Integer tabietId, String tabietNume, String tabietDesc, Date tabietDataInce, Integer tabietProgres, String tabietStatus, Integer badgeId) {
        this.tabietId = tabietId;
        this.tabietNume = tabietNume;
        this.tabietDesc = tabietDesc;
        this.tabietDataInce = tabietDataInce;
        this.tabietProgres = tabietProgres;
        this.tabietStatus = tabietStatus;
        this.badgeId = badgeId;
    }

    public Integer getTabietId() {
        return tabietId;
    }

    public void setTabietId(Integer tabietId) {
        this.tabietId = tabietId;
    }

    public String getTabietNume() {
        return tabietNume;
    }

    public void setTabietNume(String tabietNume) {
        this.tabietNume = tabietNume;
    }

    public String getTabietDesc() {
        return tabietDesc;
    }

    public void setTabietDesc(String tabietDesc) {
        this.tabietDesc = tabietDesc;
    }

    public Date getTabietDataInce() {
        return tabietDataInce;
    }

    public void setTabietDataInce(Date tabietDataInce) {
        this.tabietDataInce = tabietDataInce;
    }

    public Integer getTabietProgres() {
        return tabietProgres;
    }

    public void setTabietProgres(Integer tabietProgres) {
        this.tabietProgres = tabietProgres;
    }

    public String getTabietStatus() {
        return tabietStatus;
    }

    public void setTabietStatus(String tabietStatus) {
        this.tabietStatus = tabietStatus;
    }

    public Integer getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(Integer badgeId) {
        this.badgeId = badgeId;
    }
}
