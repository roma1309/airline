
package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;

public class FlightUtil {
    public static Flight toObject(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        Date day = resultSet.getDate("day");
        Time dateTime = resultSet.getTime("date_time");
        int cityFromId = resultSet.getInt("citi_From_Id");
        int cityToId = resultSet.getInt("citi_To_Id");
        int airplaneId = resultSet.getInt("airplane_Id");
        Date createdAt = resultSet.getDate("created_at");
        Date updatedAt = resultSet.getDate("updated_at");

        return new Flight(id,day,dateTime,cityFromId,cityToId,airplaneId, createdAt, updatedAt);
    }
}


