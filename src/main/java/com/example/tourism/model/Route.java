package com.example.tourism.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Route Document")
@Document(collection = "route")
public class Route {
    @Id
    private String id;
    private String startPlace;
    private String endPlace;
    private LocalDate startDate;
    private LocalDate endDate;
}
