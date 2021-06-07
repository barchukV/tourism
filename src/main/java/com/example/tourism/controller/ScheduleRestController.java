package com.example.tourism.controller;

import com.example.tourism.model.Schedule;
import com.example.tourism.service.schedule.impls.ScheduleServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/schedules")
public class ScheduleRestController {
    final
    ScheduleServiceImpl service;

    public ScheduleRestController(ScheduleServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all schedules")
    @GetMapping("/get/all")
    public List<Schedule> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get schedule by id")
    @GetMapping("/get/{id}")
    public Schedule getById(@PathVariable("id") @Parameter(name = "id", description = "ID of schedule to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete schedule by id")
    @DeleteMapping("/delete/{id}")
    public Schedule deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of schedule to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new schedule")
    @PostMapping("/create/")
    public Schedule create(@RequestBody Schedule schedule){
        return service.create(schedule);
    }

    @Operation(summary = "Edit schedule")
    @PutMapping("/update/")
    public Schedule update(@RequestBody Schedule schedule){
        return service.update(schedule);
    }
}
