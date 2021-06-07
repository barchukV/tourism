package com.example.tourism.controller;

import com.example.tourism.model.Campaign;
import com.example.tourism.service.campaign.impls.CampaignServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/campaigns")
public class CampaignRestController {
    final
    CampaignServiceImpl service;

    public CampaignRestController(CampaignServiceImpl service) {
        this.service = service;
    }


    @Operation(summary = "Get all campaigns")
    @GetMapping("/get/all")
    public List<Campaign> getAll(){
        return service.getAll();
    }

    @Operation(summary = "Get campaign by id")
    @GetMapping("/get/{id}")
    public Campaign getById(@PathVariable("id") @Parameter(name = "id", description = "ID of amateur to get", required = true) String id){
        return service.getById(id);
    }

    @Operation(summary = "Delete campaign by id")
    @DeleteMapping("/delete/{id}")
    public Campaign deleteById(@PathVariable("id") @Parameter(name = "id", description = "ID of amateur to delete", required = true) String id){
        return service.delete(id);
    }

    @Operation(summary = "Add new campaign")
    @PostMapping("/create/")
    public Campaign create(@RequestBody Campaign campaign){
        return service.create(campaign);
    }

    @Operation(summary = "Edit campaign")
    @PutMapping("/update/")
    public Campaign update(@RequestBody Campaign campaign){
        return service.update(campaign);
    }
}
