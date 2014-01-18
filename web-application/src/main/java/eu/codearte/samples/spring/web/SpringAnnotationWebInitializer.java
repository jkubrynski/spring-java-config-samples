package eu.codearte.samples.spring.web;

import org.springframework.web.context.AbstractContextLoaderInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * Created by jkubrynski@gmail.com / 2014-01-18
 */
public class SpringAnnotationWebInitializer
		extends AbstractContextLoaderInitializer {

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		AnnotationConfigWebApplicationContext applicationContext =
				new AnnotationConfigWebApplicationContext();
		applicationContext.register(SpringAnnotationConfig.class);

		return applicationContext;
	}
}
