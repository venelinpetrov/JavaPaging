package dev.vpetrov.paging.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.vpetrov.paging.model.Person;
import dev.vpetrov.paging.repository.PersonRepository;

@RestController
@RequestMapping("/api/people")
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository p) {
        this.personRepository = p;
    }

    @GetMapping
    public Page<Person> getPeople(@RequestParam int page, @RequestParam int size) {
        PageRequest pr = PageRequest.of(page, size);

        return personRepository.findAll(pr);
    }
}
