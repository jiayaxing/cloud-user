package com.jiayaxing.clouddemo.clouduser;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2Doc
@EnableFeignClients("com.jiayaxing.clouddemo.clouduser.service")
public class CloudUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudUserApplication.class, args);
	}

}
