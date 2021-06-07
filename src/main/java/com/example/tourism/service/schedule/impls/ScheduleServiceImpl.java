package com.example.tourism.service.schedule.impls;

import com.example.tourism.model.Route;
import com.example.tourism.model.Schedule;
import com.example.tourism.repository.ScheduleRepository;
import com.example.tourism.service.route.interfaces.IRouteService;
import com.example.tourism.service.schedule.interfaces.IScheduleService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ScheduleServiceImpl implements IScheduleService {
    final ScheduleRepository repository;

    public ScheduleServiceImpl(ScheduleRepository scheduleRepository) {
        this.repository = scheduleRepository;
    }


    @Override
    public Schedule getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Schedule create(Schedule schedule) {
        return repository.save(schedule);
    }

    @Override
    public Schedule update(Schedule schedule) {
        return repository.save(schedule);
    }

    @Override
    public Schedule delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Schedule> getAll() {
        return repository.findAll();
    }
}
