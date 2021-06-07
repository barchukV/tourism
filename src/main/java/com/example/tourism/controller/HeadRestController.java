package com.example.tourism.controller;

import com.example.tourism.model.Head;
import com.example.tourism.service.head.impls.HeadServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/heads")
public class HeadRestController {
    final
    HeadServiceImpl service;

    public HeadRestController(HeadServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all heads")
    @GetMapping("/get/all")
    public List<Head> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get head by id")
    @GetMapping("/get/{id}")
    public Head getById(@PathVariable("id") @Parameter(name = "id", description = "ID of head to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete head by id")
    @DeleteMapping("/delete/{id}")
    public Head deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of head to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new head")
    @PostMapping("/create/")
    public Head create(@RequestBody Head head){
        return service.create(head);
    }

    @Operation(summary = "Edit head")
    @PutMapping("/update/")
    public Head update(@RequestBody Head head){
        return service.update(head);
    }
}
