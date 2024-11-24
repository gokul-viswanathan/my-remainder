package com.mycompany.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.app.entities.Reminder;

@Repository
public interface ReminderRepository extends CrudRepository<Reminder, Integer> {}
