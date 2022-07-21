package com.wisdom.domain;

public class Bus extends PublicTransport{

    private final int fee;

    public Bus(int maximumPassenger, STATUS status, int fee) {
        super(maximumPassenger, status);
        this.fee = fee;
    }

    public int calculateFee() {
        int currentPassenger = getCurrentPassenger();
        return currentPassenger * fee;
    }

    public void checkGasAlert() {
        int gas = getGas();
        if (gas < 10) {
            this.changeStatus(STATUS.OFF);
            System.out.println("======================================================================");
            System.out.println("주유 필요");
            System.out.println("======================================================================");
        }
    }
}
