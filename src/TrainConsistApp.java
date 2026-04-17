import java.util.Scanner;
import java.util.regex.*;

/**
 * =========================================================
 * MAIN CLASS - UseCase11TrainConsistMgmnt
 * =========================================================
 * Use Case 11: Validate Train ID & Cargo Codes (Regex)
 * @author Developer
 * @version 11.0
 */
public class TrainConsistApp {

    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println(" UC11 - Validate Train ID and Cargo Code ");
        System.out.println("================================================\n");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        boolean trainValid = trainMatcher.matches();
        boolean cargoValid = cargoMatcher.matches();

        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + trainValid);
        System.out.println("Cargo Code Valid: " + cargoValid);

        System.out.println("\nUC11 validation completed...");
        scanner.close();
    }
}