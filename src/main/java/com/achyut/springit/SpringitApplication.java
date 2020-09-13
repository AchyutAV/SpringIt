package com.achyut.springit;

import com.achyut.springit.config.SpringitProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@SpringBootApplication
//@EnableConfigurationProperties(SpringitProperties.class)
public class SpringitApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

	@Autowired
//	private SpringitProperties springitProperties;
	private ApplicationContext applicationContext;


	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

//	@Bean
//	@Profile("dev")
	CommandLineRunner runner(){
		return args -> {
//			System.out.println("Welcome message: " + springitProperties.getWelcomeMsg());

			System.out.println("Printing out all the beans int the application context");

			System.out.println(("----------------------------------------------------"));

	 		String[] beans =  applicationContext.getBeanDefinitionNames();
			Arrays.sort(beans);
			for(String bean: beans) {
//				System.out.println(bean);
			}
		};
	}

}