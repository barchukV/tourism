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
@Schema(description = "Coach Document")
@Document(collection = "coach")
public class Coach {
    @Id
    private String id;
    private String name;
    private int age;
    private String category;
    private String experience;
}
