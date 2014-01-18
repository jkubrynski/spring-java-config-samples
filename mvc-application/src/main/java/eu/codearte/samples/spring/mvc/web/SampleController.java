package eu.codearte.samples.spring.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jkubrynski@gmail.com / 2014-01-18
 */
@Controller
@RequestMapping("/mvc")
public class SampleController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello, world!";
	}
}
