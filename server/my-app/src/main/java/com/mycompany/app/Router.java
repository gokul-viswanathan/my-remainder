package com.mycompany.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.app.entities.Reminder;

@RestController
public class Router {

    private final ReminderRepository reminderRepository;

    public Router(ReminderRepository reminderRepository){
        this.reminderRepository = reminderRepository;
    }

    @PostMapping("/reminders")
    public Reminder saveReminder(@RequestBody Reminder a){ 
        return this.reminderRepository.save(a);
    }

    @GetMapping("/reminders")
    public Iterable<Reminder> getReminder(){
        return this.reminderRepository.findAll();
    }

}
