package com.ApiECommerce.demo.service;

import com.ApiECommerce.demo.Repository.BikesRepository;
import com.ApiECommerce.demo.models.Bikes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor


public class BikesService {

private final BikesRepository bikesRepository;

    public List<Bikes> findAll() {
        return bikesRepository.findAll();
    }
    public Optional<Bikes> findById(String id) {
        return bikesRepository.findById(id);
    }

    public void deleteById(String id) {
        bikesRepository.deleteById(id);
    }
    public void save(Bikes bikes) {
        bikesRepository.insert(bikes);
    }

    public void update(Bikes bikes) {
        bikesRepository.insert(bikes);
    }





}
