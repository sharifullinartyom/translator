package ru.rsreu.sharifullin.translate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.client.RestTemplate;
import ru.rsreu.sharifullin.jdbc.JdbcInfoRequestRunner;
import ru.rsreu.sharifullin.parsing.ParsingJSON;
import ru.rsreu.sharifullin.parsing.ParsingStringRequest;

import java.util.Date;

public class RequestApiYandex {


    private JdbcInfoRequestRunner jdbcInfoRequestRunner;
    private RestTemplate restTemplate;
    private ParsingStringRequest parsingStringRequest;
    private ParsingJSON parsingJSON;

    public RequestApiYandex() {
        jdbcInfoRequestRunner = new JdbcInfoRequestRunner();
        restTemplate = new RestTemplate();
        parsingStringRequest = new ParsingStringRequest();
        parsingJSON = new ParsingJSON();
    }

    private static final String REST_API_URI = "https://translate.yandex.net/api/v1.5/tr.json/translate?key=trnsl.1.1.20181215T110359Z.b3820b1b49042d25.bd83446702a56791b0c4232956103658b782e366&lang=ru&format=plain&text=";

    public String getTranslatedString(String str, String addressIP) {

        String[] stringsWord = parsingStringRequest.parsingStr(str);
        StringBuilder responseStr = new StringBuilder();
        Date currentDate = new Date();
        Long time = currentDate.getTime();
        long anotherDate = -1;
        time = time + (60 * 60 * 24 * 1000 * anotherDate);
        currentDate = new Date(time);
        for (String aStringsWord : stringsWord) {
            responseStr.append(parsingJSON.steamOutJson(restTemplate.getForObject(REST_API_URI + aStringsWord, String.class)));
            jdbcInfoRequestRunner.addInfoDB(currentDate.toString(), aStringsWord, addressIP);
        }

        return responseStr.toString();
    }
}
