package ru.rsreu.sharifullin.parsing;
import  org.json.*;
public class ParsingJSON {
    public String steamOutJson(String strJson) {
        org.json.JSONObject parsedObject = new org.json.JSONObject(strJson); //Здесь парсим.
        JSONArray phoneNumbersArr = (JSONArray) parsedObject.get("text");
        return phoneNumbersArr.toString();
    }
}
