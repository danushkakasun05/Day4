import java.util.*;
public class Calcoption {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 1st Number: ");
        double value1 = input.nextDouble();
        System.out.print("Enter your 2nd Number: ");
        double value2 = input.nextDouble();
        System.out.println("A. Addition");
        System.out.println("B. Subtraction");
        System.out.println("C. Maultification");
        System.out.println("D. Addition");
        System.out.println("Enter your selection: ");
        String selection = input.next();
        switch (selection) {
            case "A":
                System.out.println("Addition: " + (value1 + value2));
                break;
            case "B":
                if (value1 > value2) {
                    System.out.println("Subtraction: " + (value1 - value2));
                    break;

                } else {
                    System.out.println("Subtraction: " + (value2 - value1));
                    break;
                }
            case "C":
                System.out.println("Multification: " + (value1 * value2));
                break;
            case "D":
                if (value1 > value2) {
                    System.out.println("division: " + (double) (value1 / value2));
                    break;

                } else {
                    System.out.println("Division: " + (double) (value2 / value1));
                    break;
                }
            default:
                System.out.println("Invalid input");
        }
    }
}
