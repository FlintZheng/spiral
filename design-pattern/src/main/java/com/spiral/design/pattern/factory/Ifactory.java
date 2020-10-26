package com.spiral.design.pattern.factory;


import com.spiral.design.pattern.factory.constant.FactoryEnum;
import com.spiral.design.pattern.factory.service.IFactoryService;
import com.spiral.design.pattern.factory.service.impl.CarService;
import com.spiral.design.pattern.factory.service.impl.FoodService;

/**
 * @author dengpeng
 */
public class Ifactory {

    public IFactoryService getService(Integer serviceType) {
        if (FactoryEnum.NONE.getType().equals(serviceType)) {
            return null;
        }
        if (FactoryEnum.CAR.getType().equals(serviceType) ) {
            return new CarService();
        }
        if (FactoryEnum.FOOD.getType().equals(serviceType)) {
            return new FoodService();
        }
        throw new RuntimeException("Unknown Service");
    }

}
