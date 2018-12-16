package ru.rsreu.sharifullin.jdbc.model;

import java.util.Date;

public class InfoRequest {
    int id;
    Date time;
    String param;
    String ip;

    public int getId() {
        return id;
    }

    public Date getTime() {
        return time;
    }

    public String getParam() {
        return param;
    }

    public String getIp() {
        return ip;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
