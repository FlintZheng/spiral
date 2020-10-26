package com.spiral.design.pattern.constant;

import lombok.Getter;

/**
 * @author Yungui,zheng
 */

@Getter
public enum FactoryEnum {
    /**
     *
     */
    CAR(0,"Product a car"),
    FOOD(1,"Product a set of food"),
    NONE(-1,"Unknown service")
    ;

    private Integer type;
    private String desc;

    FactoryEnum(Integer type, String desc) {
        this.type=type;
        this.desc=desc;
    }
}
