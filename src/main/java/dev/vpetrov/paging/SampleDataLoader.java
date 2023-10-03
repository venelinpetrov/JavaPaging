package dev.vpetrov.paging;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;

import dev.vpetrov.paging.model.Address;
import dev.vpetrov.paging.model.Person;
import dev.vpetrov.paging.repository.PersonRepository;

@Component
public class SampleDataLoader implements CommandLineRunner {
    private final PersonRepository repository;
    private final Faker faker;
    public SampleDataLoader(PersonRepository repository) {
        this.repository = repository;
        this.faker = new Faker();
    }

    @Override
    public void run(String ...args) {
        List<Person> people = IntStream.rangeClosed(1, 100)
            .mapToObj(i -> new Person(
                i, faker.name().firstName(),
                faker.name().lastName(),
                faker.phoneNumber().cellPhone(),
                faker.internet().emailAddress(),
                new Address(
                    i, faker.address().streetAddress(),
                    faker.address().city(),
                    faker.address().state(),
                    faker.address().zipCode()
                )
            )).toList();

        repository.saveAll(people);
    }

}
