package com.jesusgsdev.enhancements.helpers;

public interface PricedObject {

    double getPrice();

    default double getPriceWithTax(){
        return getTaxedPriceInternal();
    }

    default double getOfferPrice(double discount){
        return getTaxedPriceInternal() * discount;
    }

    private double getTaxedPriceInternal(){
        return getPrice() * 1.21;
    }

}
