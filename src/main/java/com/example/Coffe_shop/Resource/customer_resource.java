package com.example.Coffe_shop.Resource;

import com.example.Coffe_shop.POJO.Customer;
import com.example.Coffe_shop.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/customer")
public class customer_resource {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/all")
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }
    @PostMapping(value = "/save")
    public List<Customer> saveCustomer(@RequestBody final Customer customer){
        customerRepository.save(customer);
        return customerRepository.findAll();
    }
    @GetMapping(value = "/all/{id}")
    public Optional<Customer> getCustomerid(@PathVariable int id){
    return customerRepository.findById(id);
    }


}
