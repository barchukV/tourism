package com.example.tourism.controller;

import com.example.tourism.model.Section;
import com.example.tourism.service.section.impls.SectionServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/sections")
public class SectionRestController {
    final
    SectionServiceImpl service;

    public SectionRestController(SectionServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all sections")
    @GetMapping("/get/all")
    public List<Section> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get section by id")
    @GetMapping("/get/{id}")
    public Section getById(@PathVariable("id") @Parameter(name = "id", description = "ID of section to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete section by id")
    @DeleteMapping("/delete/{id}")
    public Section deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of section to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new section")
    @PostMapping("/create/")
    public Section create(@RequestBody Section section){
        return service.create(section);
    }

    @Operation(summary = "Edit section")
    @PutMapping("/update/")
    public Section update(@RequestBody Section section){
        return service.update(section);
    }
}
