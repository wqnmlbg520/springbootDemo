package com.quantumcloud.bonus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.quantumcloud"})
@MapperScan("com.quantumcloud.bonus.mapper")
@EnableTransactionManagement//开启事务管理
public class BonusApplication {
	public static void main(String[] args) {
		SpringApplication.run(BonusApplication.class, args);
	}
}
