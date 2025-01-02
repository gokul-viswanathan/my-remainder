package com.example.reminders.UserReminder;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userReminders")
public class UserReminder {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String eventName;
    private String eventDescription;
    private LocalDate eventDate;

    @SuppressWarnings("unused")
    private UserReminder() {}

    public UserReminder(String eventName, String eventDescription, LocalDate eventDate) {
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.eventDate = eventDate;
    }

    public void setEventName(String eventName){
        this.eventName = eventName;
    }

    public String getEventName(){
        return this.eventName;
    }

    public void setEventDescription(String eventDescription){
        this.eventDescription = eventDescription;
    }

    public String getEventDescription(){
        return this.eventDescription;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public LocalDate getEventDate() {
        return this.eventDate;
    }
}
