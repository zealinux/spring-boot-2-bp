package com.example.demo.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public String index() {
        String jsonStr = "{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}";
        JSONObject jo = new JSONObject(jsonStr);
        return jo.toString();

    }
}
