package com.example.tourism.controller;

import com.example.tourism.model.Competition;
import com.example.tourism.service.competition.impls.CompetitionServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/competitions")
public class CompetitionRestController {
    final
    CompetitionServiceImpl service;

    public CompetitionRestController(CompetitionServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all competitions")
    @GetMapping("/get/all")
    public List<Competition> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get competition by id")
    @GetMapping("/get/{id}")
    public Competition getById(@PathVariable("id") @Parameter(name = "id", description = "ID of amateur to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete competition by id")
    @DeleteMapping("/delete/{id}")
    public Competition deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of competition to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new competition")
    @PostMapping("/create/")
    public Competition create(@RequestBody Competition amateur){
        return service.create(amateur);
    }

    @Operation(summary = "Edit competition")
    @PutMapping("/update/")
    public Competition update(@RequestBody Competition amateur){
        return service.update(amateur);
    }
}
