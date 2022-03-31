package uda.heroku.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HerokuController {
	
	@GetMapping("/hola")
	public String holaMundo() {
		return "Hola Mundo";
	}
}
