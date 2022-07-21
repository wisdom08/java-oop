package com.wisdom.domain;

public class Taxi extends PublicTransport {
    private final int defaultFee, feeForDistance, defaultDistance;
    private String destination;
    private int distance;

    public Taxi(int maximumPassenger, int defaultFee, int feeForDistance, int defaultDistance, STATUS status) {
        super(maximumPassenger, status);
        this.defaultFee = defaultFee;
        this.feeForDistance = feeForDistance;
        this.defaultDistance = defaultDistance;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int calculateFee() {
        return defaultFee + ((distance - defaultDistance) * feeForDistance);
    }

    public int getDefaultFee() {
        return defaultFee;
    }

    public String getDestination() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }

    public void checkGasAlert() {
        int gas = getGas();
        if (gas < 10) {
            this.changeStatus(STATUS.NoOperation);
            System.out.println("======================================================================");
            System.out.println("주유 필요");
            System.out.println("======================================================================");
        }
    }
}
