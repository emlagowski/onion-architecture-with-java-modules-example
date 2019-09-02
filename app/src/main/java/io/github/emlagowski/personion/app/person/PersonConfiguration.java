package io.github.emlagowski.personion.app.person;

import io.github.emlagowski.personion.domain.people.PersonFacade;
import io.github.emlagowski.personion.domain.people.PersonReader;
import io.github.emlagowski.personion.domain.people.PersonWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfiguration {
    @Bean
    PersonFacade personFacade(PersonWriter personWriter, PersonReader personReader) {
        return new PersonFacade(personWriter, personReader);
    }
}
