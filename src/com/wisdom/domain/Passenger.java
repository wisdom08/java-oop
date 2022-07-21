package com.wisdom.domain;

public class Passenger {
    public void pay(PublicTransport vehicle, int fee) {
        vehicle.calculateTotalFee(fee);
    }
    public void getOn(PublicTransport vehicle, int count) {
        vehicle.getPassenger(count);
    }
}
