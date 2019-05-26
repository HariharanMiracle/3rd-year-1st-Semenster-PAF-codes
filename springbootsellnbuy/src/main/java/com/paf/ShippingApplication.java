package com.paf;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.paf.controller.ShippingController;
import com.paf.dao.ShippingDAO;
import com.paf.model.Shipping;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan("com.paf.repository")//to scan repository files
@EntityScan("com.paf.model")
@EnableJpaRepositories("com.paf.repository")
public class ShippingApplication {
	public static void main(String args[]) {
		SpringApplication.run(ShippingApplication.class, args);
	}
}
