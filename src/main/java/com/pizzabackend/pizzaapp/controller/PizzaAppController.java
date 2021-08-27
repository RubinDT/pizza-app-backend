package com.pizzabackend.pizzaapp.controller;

import com.pizzabackend.pizzaapp.model.Pizza;
import com.pizzabackend.pizzaapp.service.PizzaAppService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PizzaAppController {
    PizzaAppService pizzaAppService;//let Spring handle instantiation

    public PizzaAppController(PizzaAppService pizzaAppService) {
        this.pizzaAppService = pizzaAppService;
    }
    //HTTP reqeusts from front end

    @CrossOrigin(origins = "http://localhost:3000")//white listing ahead of time to avoid CORS issue
    @PostMapping("/newOrder")
    public Pizza createPizzaOrder(@RequestBody Pizza pizza) {
        System.out.println("Post Mapping received with info: " + pizza.getPizzaSize());
        this.pizzaAppService.setPizzaData(pizza);
        return pizza;
    }
    @CrossOrigin(origins = "http://localhost:3000")//white listing ahead of time to avoid CORS issue
    @GetMapping("/getOrders")
    public List<Pizza> readAllOrders() {
        return this.pizzaAppService.getAllPizzaOrders();
    }


}