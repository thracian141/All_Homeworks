import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner cons = new Scanner(System.in);

        System.out.println("Input day here: ");
        int day = Integer.parseInt(cons.nextLine());

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Not a valid day!");
        }
    }
}