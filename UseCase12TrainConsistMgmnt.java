import java.util.*;

/**
 * =========================================================
 * MAIN CLASS - UseCase12TrainConsistMgmnt
 * =========================================================
 * Use Case 12: Safety Compliance Check for Goods Bogies
 * @author Developer
 * @version 12.0
 */
public class UseCase12TrainConsistMgmnt {

    static class GoodsBogie {
        String type;
        String cargo;
        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies ");
        System.out.println("================================================\n");

        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));

        System.out.println("Goods Bogies in Train:");
        for (GoodsBogie g : goodsBogies) System.out.println(g.type + " -> " + g.cargo);

        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        System.out.println("\nSafety Compliance Status: " + isSafe);
        System.out.println(isSafe ? "Train formation is SAFE." : "Train formation is NOT SAFE.");
        System.out.println("\nUC12 safety validation completed...");
    }
}
