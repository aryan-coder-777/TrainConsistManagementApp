import java.util.Arrays;

/**
 * =========================================================
 * MAIN CLASS - UseCase19TrainConsistMgmnt
 * =========================================================
 * Use Case 19: Binary Search for Bogie ID
 * @author Developer
 * @version 19.0
 */
public class UseCase19TrainConsistMgmnt {

    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("================================================\n");

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        Arrays.sort(bogieIds);

        String key = "BG309";

        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) System.out.println(id);

        int low = 0, high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = bogieIds[mid].compareTo(key);
            if (cmp == 0) { found = true; break; }
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }

        if (found) System.out.println("\nBogie " + key + " found using Binary Search.");
        else System.out.println("\nBogie " + key + " NOT found.");

        System.out.println("\nUC19 search completed...");
    }
}
