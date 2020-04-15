package com.company;

import java.util.Date;

public class Flight {
    private int id;
    private Date day;
    private Date dateTime;
    private int cityToId;
    private int cityFromId;
    private int airplanesId;
    private Date createdAt;
    private Date updatedAt;

    public Flight(int id, Date day, Date dateTime, int cityToId, int cityFromId, int airplanesId, Date createdAt, Date updatedAt) {
        this.id = id;
        this.day = day;
        this.dateTime = dateTime;
        this.cityToId = cityToId;
        this.cityFromId = cityFromId;
        this.airplanesId = airplanesId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Flight(Date day, Date dateTime, int cityToId, int cityFromId, int airplanesId) {
        this.day = day;
        this.dateTime = dateTime;
        this.cityToId = cityToId;
        this.cityFromId = cityFromId;
        this.airplanesId = airplanesId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public int getCityToId() {
        return cityToId;
    }

    public void setCityToId(int cityToId) {
        this.cityToId = cityToId;
    }

    public int getCityFromId() {
        return cityFromId;
    }

    public void setCityFromId(int cityFromId) {
        this.cityFromId = cityFromId;
    }

    public int getAirplanesId() {
        return airplanesId;
    }

    public void setAirplanesId(int airplanesId) {
        this.airplanesId = airplanesId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public static Flight createItemForSaving(Date day,Date dateTime,int cityFromId,int cityToId,int airplanesId) {
        return new Flight (day, dateTime, cityFromId, cityToId, airplanesId);


    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", day=" + day +
                ", dateTime=" + dateTime +
                ", cityToId=" + cityToId +
                ", cityFromId=" + cityFromId +
                ", airplanesId=" + airplanesId +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
