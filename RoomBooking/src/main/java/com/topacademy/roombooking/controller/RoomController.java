package com.topacademy.roombooking.controller;

import com.topacademy.roombooking.model.Room;
import com.topacademy.roombooking.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RoomController {
    private final RoomService roomService;
    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/room")
    public String search(Model model){
        Room room = new Room();
        model.addAttribute("room", room);
        return "layouts/search";
    }

    @PostMapping("/search")
    public String findByDate(@ModelAttribute Room room, Model model){
        List<Room> rooms = roomService.findByDate(room.getEnd(), room.getStart());
        model.addAttribute("rooms", rooms);
        return "layouts/room-list";
    }

    @GetMapping("/rooms")
    public String findAll(Model model){
        List<Room> rooms = roomService.findAll();
        model.addAttribute("rooms", rooms);
        return "layouts/rooms-All";
    }

    @GetMapping("/contact")
    public String contactInfo(){
        return "layouts/contact-info";
    }
}
