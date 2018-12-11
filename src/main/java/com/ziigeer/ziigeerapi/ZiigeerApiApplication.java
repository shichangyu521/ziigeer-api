package com.ziigeer.ziigeerapi;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ZiigeerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZiigeerApiApplication.class, args);
	}
}
