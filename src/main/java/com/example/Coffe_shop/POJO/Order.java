package com.example.Coffe_shop.POJO;

import javax.persistence.*;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @Column(name = "orderID")
    private Integer orderId;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private String time;

    @Column(name = "description")
    private String description;

    @Column(name = "quentity")
    private String quentity;

    @Column(name = "itemID")
    private Integer itemId;

    @Column(name = "cID")
    private Integer cId;

    public Integer getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuentity() {
        return this.quentity;
    }

    public void setQuentity(String quentity) {
        this.quentity = quentity;
    }

    public Integer getItemId() {
        return this.itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getCId() {
        return this.cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }
}
