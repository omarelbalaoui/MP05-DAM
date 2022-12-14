public class transportsJeanClaude {

    public static int carrega (int pes, int capacitat) {
        int resultat;
        if (pes >= 500 && pes <= 900 && capacitat >= 500 && capacitat <= 750 && pes <= capacitat) {
            resultat = 0;
        }else {
            resultat = -1;
        }
        return resultat;
    }
}