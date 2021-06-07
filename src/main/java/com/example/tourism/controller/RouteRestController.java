package com.example.tourism.controller;

import com.example.tourism.model.Route;
import com.example.tourism.service.route.impls.RouteServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/routes")
public class RouteRestController {
    final
    RouteServiceImpl service;

    public RouteRestController(RouteServiceImpl service) {
        this.service = service;
    }

    @Operation(summary = "Get all routes")
    @GetMapping("/get/all")
    public List<Route> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get route by id")
    @GetMapping("/get/{id}")
    public Route getById(@PathVariable("id") @Parameter(name = "id", description = "ID of route to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete route by id")
    @DeleteMapping("/delete/{id}")
    public Route deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of route to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new route")
    @PostMapping("/create/")
    public Route create(@RequestBody Route route){
        return service.create(route);
    }

    @Operation(summary = "Edit route")
    @PutMapping("/update/")
    public Route update(@RequestBody Route route){
        return service.update(route);
    }
}
