package com.edu.abhi.config.importconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * 
 * @author abhishekkhare
 *
 */
@Configuration
public class SchedulerConfig {

	@Bean(name = "scheduler")
	public SchedulerBo suchedulerBo() {

		return new SchedulerBo();

	}

}