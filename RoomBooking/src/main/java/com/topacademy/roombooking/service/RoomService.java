package com.topacademy.roombooking.service;

import com.topacademy.roombooking.model.Person;
import com.topacademy.roombooking.model.Room;
import com.topacademy.roombooking.repository.PersonRepository;
import com.topacademy.roombooking.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class RoomService {
    private final RoomRepository roomRepository;
    @Autowired
    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> findByDate(LocalDateTime dateEnd, LocalDateTime dateStart){
        return roomRepository.findAllByStartAfterOrEndBeforeOrStartIsNull(dateEnd, dateStart);
    }

    public List<Room> findAll(){
        return roomRepository.findAll();
    }

}
