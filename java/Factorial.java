public class Factorial {
    public static void main(String[] args) {
        System.out.printf("El factorial de 3 és: " + factorial(3));
    }
    public static int factorial (int numero) {
        // int aux = 1;
        if (numero > 1) {
            return numero * factorial(numero - 1);
        }
        return numero;
    }
}
