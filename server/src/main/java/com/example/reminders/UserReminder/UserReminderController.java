package com.example.reminders.UserReminder;

import org.springframework.beans.factory.annotation.Autowired;

// import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// import java.util.Date;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserReminderController{

    // Instance variables
    @Autowired
    private UserReminderRepository userReminderRepository; //this is just a instance variable of type userReminder without any value

    // public UserReminderController(UserReminderRepository userReminderRepository){
    //     //so we need to assign it the repository value in order to use Save or any method of database interaction
    //     this.userReminderRepository = userReminderRepository;
    // }

    @GetMapping("/")
    public ResponseEntity<String> setUserData(@RequestBody UserReminder event){
        this.userReminderRepository.save(event);
        return ResponseEntity.ok("the event is added " + event.getEventName());
    }

    // @GetMapping("/")
    // public Iterable<UserReminder> getUserData(){
    //     return this.userReminderRepository.findAll();
    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<UserReminder> putUserData(@PathVariable Integer id, @RequestBody UserReminder updatedEvent) {
    //     return this.userReminderRepository.findById(id)
    //                                         .map(event -> {
    //                                             event.setEventName(updatedEvent.getEventName());
    //                                             event.setEventDescription(updatedEvent.getEventDescription());
    //                                             event.setEventDate(updatedEvent.getEventDate());
    //                                             this.userReminderRepository.save(event);
                                                
    //                                         })
    }