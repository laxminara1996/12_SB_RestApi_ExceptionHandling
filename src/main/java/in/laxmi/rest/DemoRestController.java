package in.laxmi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoRestController {
    @GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "welcome to rest Api";
		int i =10/0;
		return msg;
	}
}
