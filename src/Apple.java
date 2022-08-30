import java.sql.SQLOutput;
import java.util.*;
public class Apple {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String word = name.nextLine();
        switch (word){
            case "A":
                System.out.print("Apple");
                break;
            case "B":
                System.out.print("Ball");
                break;
            default:
                System.out.println("Invalid Entry");
        }

    }
}

