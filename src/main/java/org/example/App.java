package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        final int costApartment = 500000;
        System.out.println("Стоимость квартиры : " + costApartment);

        final double firstPayMortgagePercent = 15;
        System.out.println("Процент первоначального взноса по ипотеке : " + firstPayMortgagePercent);

        double sumFirstPay = costApartment * (firstPayMortgagePercent/100);
        System.out.println("Сумма первоначального взноса : " + sumFirstPay);


    }
}
