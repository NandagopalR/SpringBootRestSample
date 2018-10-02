package com.nanda.firstexample;

import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nanda.firstexample.model.PersonModel;
import com.nanda.firstexample.request.RequestModel;

@RestController
@RequestMapping("/api")
public class PersonController {

	// http://localhost:8080/person?name=nanda&age=28
	@GetMapping(value = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
	public PersonModel getPerson(@RequestParam(value = "name") String personName,
			@RequestParam(value = "age") int age) {
		return new PersonModel(UUID.randomUUID().toString(), personName, age);
	}

	@PostMapping(path = "/addPersons", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public PersonModel addPerson(@RequestBody RequestModel model) {
		return new PersonModel(UUID.randomUUID().toString(), model.getName(), model.getAge());
	}

}
