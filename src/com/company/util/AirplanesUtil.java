package com.company.util;

import com.company.entity.Airplanes;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class AirplanesUtil {

    public static Airplanes toObject(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String model = resultSet.getString("model");
        Date createdAt = resultSet.getDate("created_at");
        Date updatedAt = resultSet.getDate("updated_at");

        return new Airplanes(id, model, createdAt, updatedAt);
    }

}

