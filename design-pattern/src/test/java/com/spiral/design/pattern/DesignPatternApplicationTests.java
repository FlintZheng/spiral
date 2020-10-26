package com.spiral.design.pattern;

import com.spiral.design.pattern.constant.FactoryEnum;
import com.spiral.design.pattern.factory.Ifactory;
import com.spiral.design.pattern.service.IFactoryService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class DesignPatternApplicationTests {

	@Test
	void contextLoads() throws Exception {
		Ifactory ifactory =new Ifactory();

		IFactoryService carService = ifactory.getService(FactoryEnum.CAR.getType());
		IFactoryService foodService = ifactory.getService(FactoryEnum.FOOD.getType());

		Map<String,String> carRequirement =new HashMap<>();
		carRequirement.put("color","white");
		carService.produce("Yungui","HAVAL",carRequirement);

		Map<String,String> foodRequirement =new HashMap<>();
		foodRequirement.put("flavour","Normal spicy");
		foodService.produce("Kenny","HAVAL",foodRequirement);
	}

}
