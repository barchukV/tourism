package com.example.tourism.controller;

import com.example.tourism.model.Amateur;
import com.example.tourism.service.amateur.impls.AmateurServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/amateurs")
public class AmateurRestController {
    final
    AmateurServiceImpl service;

    public AmateurRestController(AmateurServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all amateurs")
    @GetMapping("/get/all")
    public List<Amateur> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get amateur by id")
    @GetMapping("/get/{id}")
    public Amateur getById(@PathVariable("id") @Parameter(name = "id", description = "ID of amateur to get", required = true) String id ){
        return service.getById(id);
    }

    @Operation(summary = "Delete amateur by id")
    @DeleteMapping("/delete/{id}")
    public Amateur deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of amateur to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new amateur")
    @PostMapping("/create/")
    public Amateur create(@RequestBody Amateur amateur){
        return service.create(amateur);
    }

    @Operation(summary = "Edit amateur")
    @PutMapping("/update/")
    public Amateur update(@RequestBody Amateur amateur){
        return service.update(amateur);
    }
}
