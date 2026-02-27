import java.util.*;

public class NumberChecker{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n-.- Welcome to the number checker --");

        System.out.print("\nPlease enter a number that you want to check: ");
        int num = input.nextInt();

        if ( num > 0){
            System.out.println("\nYour entered number is Positive.");
        } else if ( num < 0) {
            System.out.println("\nYour entered number is Negative.");
        } else {
            System.out.println("\nYour entered number is Zero.");
        }

    }
}
