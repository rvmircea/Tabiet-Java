public class TabietUser {
    private Integer userId;

    private Integer tabietId;

    public TabietUser(Integer userId, Integer tabietId) {
        this.userId = userId;
        this.tabietId = tabietId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTabietId() {
        return tabietId;
    }

    public void setTabietId(Integer tabietId) {
        this.tabietId = tabietId;
    }
}
