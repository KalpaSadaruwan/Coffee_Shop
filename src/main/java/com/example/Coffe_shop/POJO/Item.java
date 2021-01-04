package com.example.Coffe_shop.POJO;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @Column(name = "itemID")
    private Integer itemId;

    @Column(name = "itemName")
    private String itemName;

    @Column(name = "Cost")
    private String cost;

    @Column(name = "Quentity")
    private String quentity;

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCost() {
        return this.cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getQuentity() {
        return this.quentity;
    }

    public void setQuentity(String quentity) {
        this.quentity = quentity;
    }
}
