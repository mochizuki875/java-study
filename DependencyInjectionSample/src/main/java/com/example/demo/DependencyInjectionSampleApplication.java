package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.chapter03.used.Calculator;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class DependencyInjectionSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DependencyInjectionSampleApplication.class, args).getBean(DependencyInjectionSampleApplication.class).execute();
	}

	// DI
	// @Componentアノテーションが付与されたクラスをSpringBootが実装
	// Calculator calculator = new AddCalc()相当
	@Autowired
	Calculator calculater;

	private void execute(){
		System.out.println("calc(x,y)=" + calculater.calc(10,5));
	}


}
