import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

public class TrainConsistApp {

    public static void main(String[] args) {

        // ================= UC1 =================
        System.out.println("==========================================");
        System.out.println("   🚆 Train Consist Management App");
        System.out.println("==========================================\n");

        List<String> trainConsist = new ArrayList<>();

        System.out.println("Train initialized successfully...");
        System.out.println("Initial number of bogies: " + trainConsist.size());
        System.out.println("\nCurrent Train Consist: " + trainConsist);


        // ================= UC2 =================
        System.out.println("\n==========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("==========================================");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies: " + passengerBogies);

        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + exists);

        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");


        // ================= UC3 =================
        System.out.println("\n==========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("==========================================");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("\nBogie IDs in the train:");
        System.out.println(bogieIds);

        System.out.println("\nNote: Duplicate IDs are automatically removed.");
    }
}