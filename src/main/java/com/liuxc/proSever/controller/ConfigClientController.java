package com.liuxc.proSever.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigClientController {

	/**
	 * 启动报错：获取不到from值参考：https://gitee.com/gongxusheng/spring-config-demo/tree/master	
	 */
	@Value("${from}")
	private String from;
	
	@RequestMapping("/from")
	public String fromValue() {
		return from;
	}
}
