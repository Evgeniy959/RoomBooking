package com.topacademy.roombooking.repository;

import com.topacademy.roombooking.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.time.LocalDate;
//import java.util.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findAllByStartAfterOrEndBeforeOrStartIsNull(LocalDateTime dateEnd, LocalDateTime dateStart);
}
