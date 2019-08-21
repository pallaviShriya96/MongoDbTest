package com.example.SpringMongoExample.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.SpringMongoExample.model.Softwares;

public interface SoftwaresRepository extends MongoRepository<Softwares, Integer> {

}
