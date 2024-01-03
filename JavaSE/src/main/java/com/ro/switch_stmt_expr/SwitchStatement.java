package com.ro.switch_stmt_expr;

import org.junit.jupiter.api.Test;

public class SwitchStatement {
    final int getNumber() { return 4; }

    public void checkNumbers() {
        final int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        final int n4 = getNumber();
        switch (n3) {
            case n1:
            //case n2:                DOES NOT COMPILE
            //case this.getNumber():  DOES NOT COMPILE
            //case n4:                DOES NOT COMPILE
            case 2 + 2:
        }
    }

    public void printDayOfWeekIfElse(int day) {
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        }
    }

    @Test
    void printDayOfWeekWithIfElse() {
        printDayOfWeekIfElse(7);
    }

    public void printDayOfWeekSwitchStatement(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid value");
        }
    }

    @Test
    void printDayOfWeekSwitchStatement() {
        printDayOfWeekSwitchStatement(3);
    }

    public void printActivityPerDays(int day) {
        switch (day) {
            case 1, 2, 3:   //syntax available starting with Java 14
                System.out.println("Mon to Wed: Going to Movie");
                break;
            case 4: case 5: case 6:       //syntax prior to Java 14
                System.out.println("Thu to Sat: Going to Theatre");
                break;
            case 7:
                System.out.println("Sunday: Staying home");
                break;
            default:
                System.out.println("Invalid value");
        }
    }

    @Test
    void printActivityPerDayTest() {
        printActivityPerDays(2);
    }
}
