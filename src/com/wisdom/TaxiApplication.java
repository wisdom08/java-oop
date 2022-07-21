package com.wisdom;

import com.wisdom.domain.Passenger;
import com.wisdom.domain.STATUS;
import com.wisdom.domain.Taxi;

public class TaxiApplication {

    static Taxi taxi = new Taxi(
            4,
            3000,
            1000,
            1,
            STATUS.BASIC
    );

    static Taxi secondTaxi = new Taxi(
            4,
            3000,
            1000,
            1,
            STATUS.BASIC
    );
    static Passenger passenger = new Passenger();

    public static void main(String[] args) {

        System.out.println("첫 번째 택시 번호 = " + taxi.getUniqueNumber());
        System.out.println("두 번째 택시 번호 = " + secondTaxi.getUniqueNumber());
        System.out.println("주유량 = " + taxi.getGas());
        System.out.println("상태 = " + taxi.getStatus());

        passenger.getOn(taxi, 2);
        taxi.setDestination("서울역");
        taxi.setDistance(2);
        taxi.changeStatus(STATUS.ON);
        printInfo();
        System.out.println("상태 = " + taxi.getStatus());

        taxi.setGas(80, "-");
        taxi.checkGasAlert();

        passenger.pay(taxi, taxi.calculateFee());
        System.out.println("주유량 = " + taxi.getGas());
        System.out.println("누적 요금 = " + taxi.getTotalFee());

        passenger.getOn(taxi, 5);
        passenger.getOn(taxi, 3);
        taxi.setDestination("구로디지털단지역");
        taxi.setDistance(12);
        taxi.changeStatus(STATUS.ON);
        printInfo();
        taxi.setGas(20, "-");
        taxi.checkGasAlert();
        passenger.pay(taxi, taxi.calculateFee());
        System.out.println("주유량 = " + taxi.getGas());
        System.out.println("상태 = " + taxi.getStatus());
        System.out.println("누적 요금= " + taxi.getTotalFee());


    }

    public static void printInfo() {
        System.out.println("======================================================================");
        System.out.println("탑승 승객 수 = " + taxi.getCurrentPassenger());
        System.out.println("잔여 승객 수 = " + taxi.calcRemainingNumberOfSeats());
        System.out.println("기본 요금 확인 = " + taxi.getDefaultFee());
        System.out.println("목적지 = " + taxi.getDestination());
        System.out.println("목적지까지의 거리 = " + taxi.getDistance() + "km");
        System.out.println("요금 확인 = " + taxi.calculateFee());
    }
}
