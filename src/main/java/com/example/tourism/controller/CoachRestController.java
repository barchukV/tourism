package com.example.tourism.controller;

import com.example.tourism.model.Coach;
import com.example.tourism.service.coach.impls.CoachServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/coaches")
public class CoachRestController {
    final
    CoachServiceImpl service;

    public CoachRestController(CoachServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all coaches")
    @GetMapping("/get/all")
    public List<Coach> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get coach by id")
    @GetMapping("/get/{id}")
    public Coach getById(@PathVariable("id") @Parameter(name = "id", description = "ID of coach to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete coach by id")
    @DeleteMapping("/delete/{id}")
    public Coach deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of amateur to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new coach")
    @PostMapping("/create/")
    public Coach create(@RequestBody Coach coach){
        return service.create(coach);
    }

    @Operation(summary = "Edit coach")
    @PutMapping("/update/")
    public Coach update(@RequestBody Coach coach){
        return service.update(coach);
    }
}
