package ru.rsreu.sharifullin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.rsreu.sharifullin.translate.RequestApiYandex;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/api")
public class RestApiController {

    @RequestMapping(value = "/trans/{strWord}", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable("strWord") String strWord, HttpServletRequest request) {
        RequestApiYandex requestApiYandex = new RequestApiYandex();
        String addressIP = request.getRemoteAddr();
        String translatedString = requestApiYandex.getTranslatedString(strWord, addressIP);

        return new ResponseEntity<>(translatedString, HttpStatus.OK);
    }


}