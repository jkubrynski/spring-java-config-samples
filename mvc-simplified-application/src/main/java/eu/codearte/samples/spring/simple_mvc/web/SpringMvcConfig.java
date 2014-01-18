package eu.codearte.samples.spring.simple_mvc.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by jkubrynski@gmail.com / 2014-01-18
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = MvcWebApplicationMarker.class)
public class SpringMvcConfig {

}
