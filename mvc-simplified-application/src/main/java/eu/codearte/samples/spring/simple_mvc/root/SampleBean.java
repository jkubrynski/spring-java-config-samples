package eu.codearte.samples.spring.simple_mvc.root;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by jkubrynski@gmail.com / 2014-01-18
 */
@Component
public class SampleBean {

	@PostConstruct
	public void postConstruct() {
		System.out.println("Context initialized...");
	}
}
