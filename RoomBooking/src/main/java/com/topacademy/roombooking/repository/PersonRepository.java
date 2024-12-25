package com.topacademy.roombooking.repository;

import com.topacademy.roombooking.model.Person;
import com.topacademy.roombooking.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
