package Gustavotestescom.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int paymentForHour, hours, wage;

        Scanner scanner = new Scanner(System.in);

        System.out.println("type your payment for hours");
        paymentForHour = scanner.nextInt();

        System.out.println("type your of work hours on month");
        hours = scanner.nextInt();

        wage = paymentForHour * hours;

        System.out.println("your wage for month is " + wage);

    }
}
