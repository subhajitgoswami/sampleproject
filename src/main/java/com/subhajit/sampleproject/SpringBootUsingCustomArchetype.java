package com.subhajit.sampleproject;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableRetry
public class SpringBootUsingCustomArchetypeApplication{

	public static void main(String[] args) {
		final SpringApplication springApplication = new SpringApplication(Application.class);
	}

}