package com.jaon;

import com.jaon.config.DBConfig1;
import com.jaon.config.DBConfig2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//注意这里我们需要开启我们扫描注解的类
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
@SpringBootApplication
public class SpringbootJtaAtomikosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJtaAtomikosApplication.class, args);
	}
}
