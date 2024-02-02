package com.myblog.myblog.java8;

public class Office {
    private long officeId;
    private String officeName;
    private String officeCity;

    public Office(long officeId, String officeName, String officeCity) {
        this.officeId = officeId;
        this.officeName = officeName;
        this.officeCity = officeCity;
    }

    public long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(long officeId) {
        this.officeId = officeId;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficeCity() {
        return officeCity;
    }

    public void setOfficeCity(String officeCity) {
        this.officeCity = officeCity;
    }
}
