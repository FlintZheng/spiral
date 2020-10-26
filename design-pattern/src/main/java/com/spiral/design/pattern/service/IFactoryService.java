package com.spiral.design.pattern.service;

import java.util.Map;

public interface IFactoryService {

    void produce(String customerId, String name, Map<String, String> extMap) throws Exception;
}
