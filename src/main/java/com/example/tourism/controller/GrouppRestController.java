package com.example.tourism.controller;

import com.example.tourism.model.Groupp;
import com.example.tourism.service.groupp.impls.GrouppServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/groups")
public class GrouppRestController {
    final
    GrouppServiceImpl service;

    public GrouppRestController(GrouppServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all groups")
    @GetMapping("/get/all")
    public List<Groupp> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get group by id")
    @GetMapping("/get/{id}")
    public Groupp getById(@PathVariable("id") @Parameter(name = "id", description = "ID of amateur to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete group by id")
    @DeleteMapping("/delete/{id}")
    public Groupp deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of group to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new group")
    @PostMapping("/create/")
    public Groupp create(@RequestBody Groupp group){
        return service.create(group);
    }

    @Operation(summary = "Edit group")
    @PutMapping("/update/")
    public Groupp update(@RequestBody Groupp group){
        return service.update(group);
    }
}
