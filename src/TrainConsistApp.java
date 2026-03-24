import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.Map;

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


        // ================= UC3 =================
        System.out.println("\n==========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("==========================================");

        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101");
        bogieIds.add("BG102");

        System.out.println("\nBogie IDs in the train:");
        System.out.println(bogieIds);


        // ================= UC4 =================
        System.out.println("\n==========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("==========================================");

        LinkedList<String> trainOrder = new LinkedList<>();

        trainOrder.add("Engine");
        trainOrder.add("Sleeper");
        trainOrder.add("AC");
        trainOrder.add("Cargo");
        trainOrder.add("Guard");

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainOrder);

        trainOrder.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting Pantry Car:");
        System.out.println(trainOrder);

        trainOrder.removeFirst();
        trainOrder.removeLast();

        System.out.println("\nAfter Removing First & Last:");
        System.out.println(trainOrder);


        // ================= UC5 =================
        System.out.println("\n==========================================");
        System.out.println(" UC5 - Preserve Insertion Order ");
        System.out.println("==========================================");

        LinkedHashSet<String> formation = new LinkedHashSet<>();

        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");
        formation.add("Sleeper"); // duplicate

        System.out.println("\nFinal Train Formation:");
        System.out.println(formation);

        System.out.println("\nUC5 completed...");


// ================= UC6 =================
        System.out.println("\n==========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("==========================================");

// Create HashMap
        Map<String, Integer> capacityMap = new HashMap<>();

// Add bogie capacities
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);

// Display capacity details
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}