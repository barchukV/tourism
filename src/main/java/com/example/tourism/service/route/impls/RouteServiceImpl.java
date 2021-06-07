package com.example.tourism.service.route.impls;

import com.example.tourism.model.Route;
import com.example.tourism.repository.RouteRepository;
import com.example.tourism.service.route.interfaces.IRouteService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class RouteServiceImpl implements IRouteService {
    final RouteRepository repository;

    public RouteServiceImpl(RouteRepository routeRepository) {
        this.repository = routeRepository;
    }


    @Override
    public Route getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Route create(Route route) {
        return repository.save(route);
    }

    @Override
    public Route update(Route route) {
        return repository.save(route);
    }

    @Override
    public Route delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Route> getAll() {
        return repository.findAll();
    }
}
