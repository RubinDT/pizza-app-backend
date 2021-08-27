package com.pizzabackend.pizzaapp.repository;

import com.pizzabackend.pizzaapp.model.Pizza;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaAppRepository extends MongoRepository<Pizza, String> {

    //Spring and Mongo line up keyword "findBy" and xyz"ID"

    public Pizza findByOrderNumber(Integer orderNumber);
    public List<Pizza> findAll();
}
