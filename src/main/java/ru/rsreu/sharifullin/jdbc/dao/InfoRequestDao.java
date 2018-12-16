package ru.rsreu.sharifullin.jdbc.dao;


import javax.sql.DataSource;
import java.util.Date;

public interface InfoRequestDao {
    public void setDataSource(DataSource dataSource);
    public void createInfoRequest( String time, String param, String ip);
}
