package com.edu.abhi.config.importconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
/**
 * 
 * @author abhishekkhare
 *
 */
@Configuration
@Import({ CustomerConfig.class, SchedulerConfig.class })
public class AppConfig {

}