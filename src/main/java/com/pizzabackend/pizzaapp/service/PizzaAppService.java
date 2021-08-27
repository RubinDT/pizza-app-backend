package com.pizzabackend.pizzaapp.service;

import com.pizzabackend.pizzaapp.model.Pizza;
import com.pizzabackend.pizzaapp.repository.PizzaAppRepository;
import org.springframework.stereotype.Service;

@Service
public class PizzaAppService {
    PizzaAppRepository pizzaAppRepository;

    public PizzaAppService(PizzaAppRepository pizzaAppRepository){
        this.pizzaAppRepository = pizzaAppRepository;
    }

    public void setPizzaData(Pizza pizza){

        this.pizzaAppRepository.save(pizza);
    }

}
