package com.example.tourism.controller;

import com.example.tourism.model.Diary;
import com.example.tourism.service.diary.impls.DiaryServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/diaries")
public class DiaryRestController {

    final
    DiaryServiceImpl service;

    public DiaryRestController(DiaryServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all diaries")
    @GetMapping("/get/all")
    public List<Diary> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get diary by id")
    @GetMapping("/get/{id}")
    public Diary getById(@PathVariable("id") @Parameter(name = "id", description = "ID of diary to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete diary by id")
    @DeleteMapping("/delete/{id}")
    public Diary deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of diary to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new diary")
    @PostMapping("/create/")
    public Diary create(@RequestBody Diary diary){
        return service.create(diary);
    }

    @Operation(summary = "Edit diary")
    @PutMapping("/update/")
    public Diary update(@RequestBody Diary diary){
        return service.update(diary);
    }
}
