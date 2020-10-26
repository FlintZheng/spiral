package com.spiral.design.pattern.factory.service;

import java.util.Map;

/**
 * @author dengpeng
 */
public interface IFactoryService {

    void produce(String customerId, String name, Map<String, String> extMap) throws Exception;
}
