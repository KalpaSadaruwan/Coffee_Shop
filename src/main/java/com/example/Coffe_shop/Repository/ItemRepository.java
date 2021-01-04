package com.example.Coffe_shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.example.Coffe_shop.POJO.Item;
public interface ItemRepository extends JpaRepository<Item, Integer>, JpaSpecificationExecutor<Item> {

}