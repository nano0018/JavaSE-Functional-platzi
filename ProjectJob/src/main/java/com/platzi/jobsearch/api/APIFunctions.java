package com.platzi.jobsearch.api;

import feign.Feign;
import feign.gson.GsonDecoder;

public interface APIFunctions {
    static <T> T buildAPI(Class<T> tClass, String url) {
        return Feign.builder()
                .decoder(new GsonDecoder())
                .target(tClass, url);
    }
}
