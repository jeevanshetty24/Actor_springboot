package com.jsp.SpringBoot_Actordb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jsp.SpringBoot_Actordb.controller.ActorController;

@SpringBootApplication
public class SpringBootActorDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActorDbApplication.class, args);
//		ApplicationContext ac=
//		ActorController bean=ac.getBean(ActorController.class);
//		bean.addActor();
	}

}
