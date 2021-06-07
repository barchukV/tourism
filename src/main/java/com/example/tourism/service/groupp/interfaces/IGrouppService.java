package com.example.tourism.service.groupp.interfaces;

import com.example.tourism.model.Groupp;

import java.util.List;

public interface IGrouppService {
    Groupp getById(String id);
    Groupp create(Groupp groupp);
    Groupp update(Groupp groupp);
    Groupp delete(String id);
    List<Groupp> getAll();
}
