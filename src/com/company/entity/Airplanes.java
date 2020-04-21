package com.company.entity;

import java.util.Date;

public class Airplanes {
    private int id;
    private String model;
    private Date createdAt;
    private Date updatedAt;

    public Airplanes(int id, String model, Date createdAt, Date updatedAt) {
        this.id = id;
        this.model = model;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Airplanes(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public static Airplanes createItemForSaving(String model) {
        return new Airplanes(model);
    }

    @Override
    public String toString() {
        return "Airplanes{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
