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
@Schema(description = "Campaign Document")
@Document(collection = "campaign")
public class Campaign {
    @Id
    private String id;
    private Route route;
    private int amountOfDays;
    private String level;
    private Tourist tourist;
    private List<Tourist> touristList;
    private String type;
    private Diary diary;
}
