/**
 * =========================================================
 * MAIN CLASS - UseCase15TrainConsistMgmnt
 * =========================================================
 * Use Case 15: Safe Cargo Assignment Using try-catch-finally
 * @author Developer
 * @version 15.0
 */
public class TrainConsistApp {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) { super(message); }
    }

    static class GoodsBogie {
        String shape;
        String cargo;
        GoodsBogie(String shape) { this.shape = shape; }

        void assignCargo(String cargo) {
            try {
                if (shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment!");
                }
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully -> " + cargo);
            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Cargo validation completed for " + shape + " bogie");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println(" UC15 - Safe Cargo Assignment ");
        System.out.println("================================================\n");

        GoodsBogie cylindrical = new GoodsBogie("Cylindrical");
        cylindrical.assignCargo("Petroleum");

        System.out.println();

        GoodsBogie rectangular = new GoodsBogie("Rectangular");
        rectangular.assignCargo("Petroleum");

        System.out.println("\nUC15 runtime handling completed...");
    }
}