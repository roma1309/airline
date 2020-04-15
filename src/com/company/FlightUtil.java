package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class FlightUtil {
    public static Flight toObject(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        Date day = resultSet.getDate("day");
        Date dateTime = resultSet.getDate("date_time");
        int cityToId = resultSet.getInt("citi_To_Id");
        int cityFromId = resultSet.getInt("citi_From_Id");
        int airplanesId = resultSet.getInt("airplane_Id");
        Date createdAt = resultSet.getDate("created_at");
        Date updatedAt = resultSet.getDate("updated_at");

        return new Flight(id,day,dateTime,cityFromId,cityToId,airplanesId, createdAt, updatedAt);
    }
}
