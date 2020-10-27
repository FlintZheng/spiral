package com.spiral.design.pattern;

import com.spiral.design.pattern.builder.Builder;
import com.spiral.design.pattern.builder.IMenu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DesignPatternApplication.class, args);

		Builder builder =new Builder();

		// 豪华欧式
		System.out.println(builder.levelOne(132.52D).getDetail());

		// 轻奢田园
		System.out.println(builder.levelTwo(98.25D).getDetail());

		// 现代简约
		System.out.println(builder.levelThree(85.43D).getDetail());

	}

}
