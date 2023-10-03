package dev.vpetrov.paging;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dev.vpetrov.paging.model.Address;
import dev.vpetrov.paging.model.Person;
import dev.vpetrov.paging.repository.PersonRepository;

@Component
public class SampleDataLoader implements CommandLineRunner {
    private final PersonRepository repository;
    public SampleDataLoader(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String ...args) {
        Person p = new Person("josh", "smith", "123", "j.s@mail.com", new Address("1 str", "Sofia", "Sofia", "1000"));

        repository.save(p);
    }

}
