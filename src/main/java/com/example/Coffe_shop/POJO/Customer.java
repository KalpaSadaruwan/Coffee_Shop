package com.example.Coffe_shop.POJO;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "cID")
    private Integer cId;

    @Column(name = "cname")
    private String cname;

    @Column(name = "Address")
    private String address;

    @Column(name = "state")
    private String state;

    @Column(name = "Mobile")
    private String mobile;

    public Integer getCId() {
        return this.cId;
    }

    public void setCId(Integer cId) {
        this.cId = cId;
    }

    public String getCname() {
        return this.cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
