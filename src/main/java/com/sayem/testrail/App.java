package com.sayem.testrail;

import org.json.simple.JSONObject;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws APIException, IOException {

        APIClient apiClient = new APIClient("https://sayem.testrail.com");
        apiClient.setUser("xxxx");
        apiClient.setPassword("xxxx");
        JSONObject c;
        c = (JSONObject) apiClient.sendGet("get_case/317");
        System.out.println(c.get("title"));
    }
}
