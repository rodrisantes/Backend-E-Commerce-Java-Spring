package com.ApiECommerce.demo.controller;


import com.ApiECommerce.demo.models.Bikes;
import com.ApiECommerce.demo.service.BikesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpRequest;
import java.util.List;

@RestController
@RequestMapping("/api/bikes")
@RequiredArgsConstructor

public class BikesController {
    private final BikesService bikesService;

    @PostMapping
    public void save(@RequestBody Bikes bikes) {
        bikesService.save(bikes);
        System.out.println("Post enviado");
    }
    @GetMapping
    public List<Bikes> findAll(){
        return bikesService.findAll();
    }
    @GetMapping("/{id}")
    public Bikes findById(@PathVariable String id){
        return bikesService.findById(id).get();
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        bikesService.deleteById(id);
    }
    @PutMapping
    public void update(@RequestBody Bikes bikes){
        bikesService.save(bikes);
    }


}



