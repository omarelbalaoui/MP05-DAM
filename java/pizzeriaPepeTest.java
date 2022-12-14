
    import org.junit.jupiter.api.*;


    class pizzeriaPepeTest {


        @Test //Valor entre els límits
        void prova1() {
            boolean pot = pizzeriaPepe.potCarregar(3);
            Assertions.assertTrue(pot);
        }

        @Test //Valor superior al límit superior
        void prova2() {
            boolean pot = pizzeriaPepe.potCarregar(11);
            Assertions.assertFalse(pot);
        }


        @Test //Valor inferior al límit inferior
        void prova3() {
            boolean pot = pizzeriaPepe.potCarregar(-2);
            Assertions.assertFalse(pot);
        }


        @Test //Valor no és un número
        void prova4() {
            boolean pot = pizzeriaPepe.potCarregar("cinc");
            Assertions.assertFalse(pot);
        }


}
