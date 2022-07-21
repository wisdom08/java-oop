package com.wisdom.domain;

public class PublicTransport {
    static int count;
    private final String uniqueNumber;
    private int gas, speed, currentPassenger, remainingNumberOfSeats;
    private STATUS status;
    private int totalFee;
    private final int maximumPassenger;


    public PublicTransport(int maximumPassenger, STATUS status) {
        gas = 100;
        speed = 0;
        this.maximumPassenger = maximumPassenger;
        this.status = status;
        count++;
        char c = randomAlphabet();
        uniqueNumber = String.format("%c-%d", c, count);
        remainingNumberOfSeats = maximumPassenger;
    }

    public int getTotalFee() {
        return totalFee;
    }

    private char randomAlphabet() {
        return (char) ('A' + Math.random() * 26);
    }

    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public void getPassenger(int passengers) {
        if (passengers > maximumPassenger) {
            System.out.println("======================================================================");
            System.out.println("최대 승객 수 초과");
            System.out.println("======================================================================");
        } else if (status == STATUS.ON || status == STATUS.BASIC) {
            this.currentPassenger = passengers;
        }
    }

    public int getCurrentPassenger() {
        return currentPassenger;
    }

    public int calcRemainingNumberOfSeats() {
        return remainingNumberOfSeats = maximumPassenger - currentPassenger;
    }

    public int getGas() {
        return gas;
    }


    public void setGas(int gas, String operator) {
        if (operator.equals("-")) {
            this.gas -= gas;
        } else {
            this.gas += gas;
        }
    }


    public String getStatus() {
        return status.getStatus();
    }

    public void changeStatus(STATUS status) {
        this.status = status;
        if (status == STATUS.OFF) {
            currentPassenger = 0;
        }
    }


    public void calculateTotalFee(int fee) {
        totalFee += fee;
    }

    public void setSpeed(int speed, String operator) {
        if (operator.equals("-")) {
            this.speed -= speed;
        } else {
            this.speed += speed;
        }
    }
}
