package com.vinspier.nacos.cloud.consumer.service.impl;

import com.vinspier.nacos.cloud.consumer.client.AllotClient;
import com.vinspier.nacos.cloud.consumer.service.AllotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AllotServiceImpl implements AllotService{

    @Autowired
    private AllotClient allotClient;

    @Override
    public ResponseEntity<String> getBrokerTree() {
        return allotClient.getBrokerTree();
    }
}
