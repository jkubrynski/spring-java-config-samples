package eu.codearte.samples.spring.mvc;

import eu.codearte.samples.spring.mvc.root.SpringRootConfig;
import eu.codearte.samples.spring.mvc.web.SpringMvcConfig;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

/**
 * Created by jkubrynski@gmail.com / 2014-01-18
 */
public class SpringWebMvcInitializer
		extends AbstractDispatcherServletInitializer {

	@Override
	protected WebApplicationContext createRootApplicationContext() {
		AnnotationConfigWebApplicationContext applicationContext =
				new AnnotationConfigWebApplicationContext();
		applicationContext.register(SpringRootConfig.class);

		return applicationContext;
	}

	@Override
	protected WebApplicationContext createServletApplicationContext() {
		AnnotationConfigWebApplicationContext applicationContext =
				new AnnotationConfigWebApplicationContext();
		applicationContext.register(SpringMvcConfig.class);

		return applicationContext;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/*"};
	}

}
