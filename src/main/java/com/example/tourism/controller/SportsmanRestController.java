package com.example.tourism.controller;

import com.example.tourism.model.Sportsman;
import com.example.tourism.service.sportsman.impls.SportsmanServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/sportsmen")
public class SportsmanRestController {
    final
    SportsmanServiceImpl service;

    public SportsmanRestController(SportsmanServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all sportsmen")
    @GetMapping("/get/all")
    public List<Sportsman> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get sportsman by id")
    @GetMapping("/get/{id}")
    public Sportsman getById(@PathVariable("id") @Parameter(name = "id", description = "ID of sportsman to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete sportsman by id")
    @DeleteMapping("/delete/{id}")
    public Sportsman deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of sportsman to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new sportsman")
    @PostMapping("/create/")
    public Sportsman create(@RequestBody Sportsman sportsman){
        return service.create(sportsman);
    }

    @Operation(summary = "Edit sportsman")
    @PutMapping("/update/")
    public Sportsman update(@RequestBody Sportsman sportsman){
        return service.update(sportsman);
    }
}
