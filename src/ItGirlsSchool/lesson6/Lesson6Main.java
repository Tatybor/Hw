package ItGirlsSchool.lesson6;
import java.util.Scanner;
public class Lesson6Main {
    public static void main(String[] args) {
        Lesson6.DaysOfWeek day = Lesson6.DaysOfWeek.THURSDAY;

        switch (day) {
            case SUNDAY:
                System.out.println("выходной");
                break;
            case MONDAY:
                System.out.println("будний");
                break;
            case TUESDAY:
                System.out.println("будний");
                break;
            case WEDNESDAY:
                System.out.println("будний");
                break;
            case THURSDAY:
                System.out.println("будний");
                break;
            case FRIDAY:
                System.out.println("будний");
                break;
            case SATURDAY:
                System.out.println("выходной");
                break;
            default:
                System.out.println("такого дня недели не существует");
                break;
        }
    }
}