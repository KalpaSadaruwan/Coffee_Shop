package com.example.Coffe_shop.Resource;

import com.example.Coffe_shop.POJO.Item;
import com.example.Coffe_shop.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/item")
public class item_resource {
    @Autowired
    ItemRepository itemRepository;

    @GetMapping (value = "/all")
    public List<Item> getAll(){
        return itemRepository.findAll();
    }
}
