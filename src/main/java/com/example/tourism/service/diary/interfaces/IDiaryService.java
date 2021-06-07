package com.example.tourism.service.diary.interfaces;

import com.example.tourism.model.Diary;

import java.util.List;

public interface IDiaryService {
    Diary getById(String id);
    Diary create(Diary diary);
    Diary update(Diary diary);
    Diary delete(String id);
    List<Diary> getAll();
}
