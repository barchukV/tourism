package com.example.tourism.service.schedule.interfaces;

import com.example.tourism.model.Schedule;

import java.util.List;

public interface IScheduleService {
    Schedule getById(String id);
    Schedule create(Schedule schedule);
    Schedule update(Schedule schedule);
    Schedule delete(String id);
    List<Schedule> getAll();
}
