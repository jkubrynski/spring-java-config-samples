package eu.codearte.samples.spring.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jkubrynski@gmail.com / 2014-01-18
 */
@Configuration
@ComponentScan(basePackageClasses = AnnotationWebApplicationMarker.class)
public class SpringAnnotationConfig {

}
