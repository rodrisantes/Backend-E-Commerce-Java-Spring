package com.ApiECommerce.demo.Repository;

import com.ApiECommerce.demo.models.Bikes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikesRepository extends MongoRepository<Bikes, String > {



}