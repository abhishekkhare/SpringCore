package com.edu.abhi.config.importconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * @author abhishekkhare
 *
 */
@Configuration
public class CustomerConfig {

	@Bean(name="customer")
	public CustomerBo customerBo(){

		return new CustomerBo();

	}
}