package com.company;

import java.sql.Time;
import java.util.Date;

public class Flight {
    private int id;
    private Date day;
    private Time dateTime;
    private int cityToId;
    private int cityFromId;
    private int airplaneId;
    private Date createdAt;
    private Date updatedAt;

    public Flight(int id, Date day, Time dateTime, int cityToId, int cityFromId, int airplaneId, Date createdAt, Date updatedAt) {
        this.id = id;
        this.day = day;
        this.dateTime = dateTime;
        this.cityToId = cityToId;
        this.cityFromId = cityFromId;
        this.airplaneId = airplaneId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Flight(Date day, Time dateTime, int cityToId, int cityFromId, int airplaneId) {
        this.day = day;
        this.dateTime = dateTime;
        this.cityToId = cityToId;
        this.cityFromId = cityFromId;
        this.airplaneId = airplaneId;
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

    public void setDateTime(Time dateTime) {
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

    public int getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(int airplaneId) {
        this.airplaneId = airplaneId;
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

    public static Flight createItemForSaving(Date day, Time dateTime, int cityFromId, int cityToId, int airplaneId) {
        return new Flight(day, dateTime, cityFromId, cityToId, airplaneId);


    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", day=" + day +
                ", dateTime=" + dateTime +
                ", cityToId=" + cityToId +
                ", cityFromId=" + cityFromId +
                ", airplanesId=" + airplaneId +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
