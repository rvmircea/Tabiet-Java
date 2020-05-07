import java.util.Date;

public class Badge {

    private Integer badgeId;

    private Integer tabietId;

    private String numeBadge;

    private Date dataObtinere;

    private Integer nivelBadge;

    private String mesajIncrj;

    public Badge(Integer badgeId, Integer tabietId, String numeBadge, Date dataObtinere, Integer nivelBadge, String mesajIncrj) {
        this.badgeId = badgeId;
        this.tabietId = tabietId;
        this.numeBadge = numeBadge;
        this.dataObtinere = dataObtinere;
        this.nivelBadge = nivelBadge;
        this.mesajIncrj = mesajIncrj;
    }

    public Integer getBadgeId() {
        return badgeId;
    }

    public void setBadgeId(Integer badgeId) {
        this.badgeId = badgeId;
    }

    public Integer getTabietId() {
        return tabietId;
    }

    public void setTabietId(Integer tabietId) {
        this.tabietId = tabietId;
    }

    public String getNumeBadge() {
        return numeBadge;
    }

    public void setNumeBadge(String numeBadge) {
        this.numeBadge = numeBadge;
    }

    public Date getDataObtinere() {
        return dataObtinere;
    }

    public void setDataObtinere(Date dataObtinere) {
        this.dataObtinere = dataObtinere;
    }

    public Integer getNivelBadge() {
        return nivelBadge;
    }

    public void setNivelBadge(Integer nivelBadge) {
        this.nivelBadge = nivelBadge;
    }

    public String getMesajIncrj() {
        return mesajIncrj;
    }

    public void setMesajIncrj(String mesajIncrj) {
        this.mesajIncrj = mesajIncrj;
    }
}
