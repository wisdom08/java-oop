package com.wisdom;

import com.wisdom.domain.Passenger;
import com.wisdom.domain.STATUS;
import com.wisdom.domain.Bus;

public class BusApplication {
    static Bus bus = new Bus(30, STATUS.ON, 1000);
    static Bus secondBus = new Bus(30, STATUS.ON, 1000);
    static Passenger passenger = new Passenger();

    public static void main(String[] args) {
        System.out.println("bus 의 버스 번호 = " + bus.getUniqueNumber());
        System.out.println("secondBus 의 버스 번호 = " + secondBus.getUniqueNumber());

        passenger.getOn(bus, 2);
        printInfo();
        bus.setGas(50, "-");
        bus.checkGasAlert();

        System.out.println("주유량 = " + bus.getGas());
        System.out.println("======================================================================");
        bus.changeStatus(STATUS.OFF);
        bus.setGas(10, "+");
        bus.checkGasAlert();

        System.out.println("상태 = " + bus.getStatus());
        System.out.println("주유량 = " + bus.getGas());
        System.out.println("======================================================================");
        bus.changeStatus(STATUS.ON);
        passenger.getOn(bus, 45);
        passenger.getOn(bus, 5);
        printInfo();
        bus.setGas(55, "-");
        bus.checkGasAlert();
        System.out.println("주유량 = " + bus.getGas());
        System.out.println("상태 = " + bus.getStatus());
    }

    public static void printInfo() {
        System.out.println("======================================================================");
        System.out.println("탑승 승객 수 = " + bus.getCurrentPassenger());
        System.out.println("잔여 승객 수 = " + bus.calcRemainingNumberOfSeats());
        System.out.println("요금 확인 = " + bus.calculateFee());
        System.out.println("======================================================================");
    }
}

