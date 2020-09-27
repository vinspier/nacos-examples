package com.vinspier.nacos.cloud.consumer.service;

import org.springframework.http.ResponseEntity;

public interface AllotService {

    ResponseEntity<String> getBrokerTree();

}
