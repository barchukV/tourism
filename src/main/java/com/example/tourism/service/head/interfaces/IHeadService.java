package com.example.tourism.service.head.interfaces;

import com.example.tourism.model.Head;

import java.util.List;

public interface IHeadService {
    Head getById(String id);
    Head create(Head head);
    Head update(Head head);
    Head delete(String id);
    List<Head> getAll();
}
