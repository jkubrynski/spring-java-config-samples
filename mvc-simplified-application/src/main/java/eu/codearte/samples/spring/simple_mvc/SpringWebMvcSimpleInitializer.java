package eu.codearte.samples.spring.simple_mvc;

import eu.codearte.samples.spring.simple_mvc.root.SpringRootConfig;
import eu.codearte.samples.spring.simple_mvc.web.SpringMvcConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by jkubrynski@gmail.com / 2014-01-18
 */
public class SpringWebMvcSimpleInitializer
		extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {SpringRootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringMvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"/*"};
	}

}
