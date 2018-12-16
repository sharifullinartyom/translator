package ru.rsreu.sharifullin.jdbc.util;

import org.springframework.jdbc.core.RowMapper;
import ru.rsreu.sharifullin.jdbc.model.InfoRequest;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InfoRequestMapper implements RowMapper {
    @Override
    public InfoRequest mapRow(ResultSet resultSet, int i) throws SQLException {
        InfoRequest infoRequest = new InfoRequest();
        infoRequest.setId(resultSet.getInt("id"));
        infoRequest.setTime(resultSet.getDate("date"));
        infoRequest.setParam(resultSet.getString("param"));
        infoRequest.setIp(resultSet.getString("ip"));
        return infoRequest;
    }
}
