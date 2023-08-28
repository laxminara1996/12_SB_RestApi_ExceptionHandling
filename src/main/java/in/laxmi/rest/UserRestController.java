package in.laxmi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.laxmi.exception.UserNotFoundException;

@RestController
public class UserRestController {
	@GetMapping("/user/{userId}")
	public String getUser(@PathVariable("userId") Integer userId) throws Exception {

		if (userId == 100) {
			return "johon";
		} else if (userId == 200) {
			return "laxmi";
		} else {
			throw new UserNotFoundException("user not found");
		}
	}
}
