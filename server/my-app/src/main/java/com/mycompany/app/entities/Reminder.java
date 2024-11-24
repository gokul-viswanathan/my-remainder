package com.mycompany.app.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reminder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer User_id;

    private LocalDate Event_date;

    private String Event_descrpition;

    private LocalDateTime created_Date;

    private LocalDateTime modified_Date;

    private String status;

    @SuppressWarnings("unused")
    private Reminder() {}

    public Reminder(Integer User_id, LocalDate Event_date, String Event_descrpition, String status) {
        this.User_id = User_id;
        this.Event_date = Event_date;
        this.Event_descrpition = Event_descrpition;
        this.created_Date = LocalDateTime.now();
        this.modified_Date = LocalDateTime.now();
        this.status = status;
    }

    public Integer getUserId(){
        return this.User_id;
    }

    public LocalDate getEvent_date(){
        return this.Event_date;
    }

    public void setEvent_date(LocalDate Event_date){
        this.Event_date = Event_date;
    }

    public String getEvent_descrpition() {
        return this.Event_descrpition;
    }

    public void setEvent_descrpition(String Event_descrpition) {
        this.Event_descrpition = Event_descrpition;
    }

    public LocalDateTime getCreated_Date() {
        return this.created_Date;
    }

    public void setCreated_Date(LocalDateTime created_Date) {
        this.created_Date = created_Date;
    }

    public LocalDateTime getModified_Date() {
        return this.modified_Date;
    }

    public void setModified_Date(LocalDateTime modified_Date) {
        this.modified_Date = modified_Date;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
