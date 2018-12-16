package ru.rsreu.sharifullin.jdbc.dao.jdbc;

import ru.rsreu.sharifullin.jdbc.dao.InfoRequestDao;

import javax.sql.DataSource;
import java.util.Date;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcTemplateInfoRequestDaoImpl implements InfoRequestDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;


    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void createInfoRequest( String time, String param, String ip) {
        String SQL = "INSERT INTO INFO (time,param,ip) VALUES (?,?,?)";
        jdbcTemplate.update(SQL, time, param, ip);
    }

}
