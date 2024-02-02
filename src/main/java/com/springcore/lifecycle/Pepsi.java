package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Pepsi() {
        super();
    }

    @Override
    public String toString() {
        return "price of Pepsi:- " + this.price;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // init method of XML config technique
        System.out.println("Taking pepsi : init");
    }


    @Override
    public void destroy() throws Exception {
        // destroy method of XML config technique
        System.out.println("Disposing pepsi : destroy");
    }
}
