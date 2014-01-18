package eu.codearte.samples.spring.simple_mvc.root;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jkubrynski@gmail.com / 2014-01-18
 */
@Configuration
@ComponentScan(basePackageClasses = MvcRootApplicationMarker.class)
public class SpringRootConfig {

}
