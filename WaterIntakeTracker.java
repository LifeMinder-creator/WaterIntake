import java.util.Scanner;

public class WaterIntakeTracker {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int targetAmount = 2000; // Target amount of water in milliliters
        int currentAmount = 0; // Current amount of water in milliliters
        
        while (true) {
            System.out.println("Enter the amount of water you drank so far (in milliliters):");
            int amount = scanner.nextInt();
            currentAmount += amount;
            int remainingAmount = targetAmount - currentAmount;
            
            if (remainingAmount <= 0) {
                System.out.println("Congratulations! You've reached your daily water intake goal.");
                break;
            } else {
                System.out.println("You still need to drink " + remainingAmount + " milliliters of water to reach your goal.");
            }
        }
        
        scanner.close();
    }
}
