package com.topacademy.roombooking.service;

import com.topacademy.roombooking.model.Person;
import com.topacademy.roombooking.model.Room;
import com.topacademy.roombooking.repository.PersonRepository;
import com.topacademy.roombooking.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person savePerson(Person person){
        return personRepository.save(person);
    }
}
