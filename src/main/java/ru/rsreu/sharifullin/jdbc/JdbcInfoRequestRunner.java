package ru.rsreu.sharifullin.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.rsreu.sharifullin.jdbc.dao.jdbc.JdbcTemplateInfoRequestDaoImpl;

import java.util.Date;

public class JdbcInfoRequestRunner {
    JdbcTemplateInfoRequestDaoImpl jdbcTemplateDeveloperDao;

    public JdbcInfoRequestRunner() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("DB-Config.xml");
        jdbcTemplateDeveloperDao =
                (JdbcTemplateInfoRequestDaoImpl) context.getBean("jdbcTemplateInfoRequestDao");


    }

    public void addInfoDB(String time, String param, String ip) {

        jdbcTemplateDeveloperDao.createInfoRequest(time,param,ip);
    }
}
