package com.app.financiera.demo.service.impl;

import com.app.financiera.demo.service.ExternalApiService;
import org.springframework.web.client.RestTemplate;

public class ExternalApiServiceImpl implements ExternalApiService {

    private final RestTemplate restTemplate;
    private final String apiUrl;

    public ExternalApiServiceImpl(RestTemplate restTemplate, String apiUrl) {
        this.restTemplate = restTemplate;
        this.apiUrl = apiUrl;
    }


    @Override
    public String getExternalApiData() {
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
