package com.example.tourism.service.route.interfaces;

import com.example.tourism.model.Route;

import java.util.List;

public interface IRouteService {
    Route getById(String id);
    Route create(Route route);
    Route update(Route route);
    Route delete(String id);
    List<Route> getAll();
}
