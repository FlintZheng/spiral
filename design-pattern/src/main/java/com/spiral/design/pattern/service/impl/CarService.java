package com.spiral.design.pattern.service.impl;

import com.spiral.design.pattern.service.IFactoryService;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class CarService implements IFactoryService {
    @Override
    public void produce(String customerId, String name, Map<String, String> extMap) throws Exception {
        log.info(">>> Produce Car {},for customer {},with requirement {}",name,customerId,extMap);
    }
}
