package com.liuxc.proSever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.config.server.EnableConfigServer;

//@EnableConfigServer			// 开启配置中心服务.静态配置才需要
@EnableDiscoveryClient		// 注册服务到注册中心
@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);

	}

}
