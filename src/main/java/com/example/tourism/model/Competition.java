package com.example.tourism.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Competition Document")
@Document(collection = "competition")
public class Competition {
    @Id
    private String id;
    private String name;
    private String type;
    private List<Sportsman> sportsmanList;
    private List<Coach> coachList;
}
