package com.ro.switch_stmt_expr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SwitchExpression {

    public String printDayOfWeek(int day) {
        return switch(day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> {
                System.out.println("case 6 reached");
                //any other code
                yield "Saturday";
            }
            case 7 -> "Sunday";
            default -> "Invalid value";
        };
    }

    @Test
    public void testSwitchExpressionResult() {
        assertEquals("Friday", printDayOfWeek(5));
        assertEquals("Saturday", printDayOfWeek(6));
        assertEquals("Invalid value", printDayOfWeek(8));
    }

    public void printActivityPerDays(int day) {
        switch(day) {
            case 1, 2, 3 -> System.out.println("Mon to Wed: Going to Movie");
            case 4, 5, 6 -> System.out.println("Thu to Sat: Going to Theatre");
            case 7 -> System.out.println("Sunday: Staying home");
        }
    }

    enum Level { LOW, MEDIUM, HIGH  }

    public void checkPlayerLevel(Level level) {
        String playerLevel = switch (level) {
            case LOW -> "Low level";
            case MEDIUM -> "Medium level";
            default -> "No level reached";
        };
    }

}
