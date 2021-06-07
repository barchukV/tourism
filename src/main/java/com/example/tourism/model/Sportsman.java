package com.example.tourism.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Sportsman Document")
@Document(collection = "sportsman")
public class Sportsman {
    @Id
    private String id;
    private Tourist tourist;
    private int yearsOfSports;
    private String sportsTitle;
}
