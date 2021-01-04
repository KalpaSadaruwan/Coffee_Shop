package com.example.Coffe_shop.Resource;

import com.example.Coffe_shop.POJO.Order;
import com.example.Coffe_shop.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/order")
public class order_resource {
    @Autowired
    OrderRepository orderRepository;

    @GetMapping(value = "/all")
    public List<Order> allRe(){
        return orderRepository.findAll();
    }

    @GetMapping(value = "/all/{id}")
    public Optional<Order> getCustomerid(@PathVariable int id){
        return orderRepository.findById(id);
    }
}
