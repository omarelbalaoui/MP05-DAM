public class pizzeriaPepe {

    public static boolean potCarregar(int pizzes) {
        boolean pot = false;
        if (pizzes <= 10 && pizzes >= 1) {
            pot = true;
        }
        return pot;
    }
}