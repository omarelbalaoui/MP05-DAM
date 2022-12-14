# Activitats:

## Activitats Caixa Negra:

### Pizzeria Pepe:

Un programa controla si una comanda de pizzes la pot portar un repartidor.

Heu de tenir en compte que un repartidor pot portar 10 pizzes com a màxim a la >

El programa retorna true si la comanda es pot portar i false en cas contrari.

Es demana:

- Fer el codi font del programa.
```java
public class pizzeriaPepe {

    public static boolean potCarregar(int pizzes) {
        boolean pot = false;
        if (pizzes <= 10 && pizzes >= 1) {
            pot = true;
        }
        return pot;
    }
}
```
- Fer la taula amb les particions equivalents i casos vàlids i no vàlids.

| Paràmetres | Condicions | Classes Vàlides | Classes no vàlides |
| ---------- | ---------- | ---------- | ---------- |
|Pizzes | - Numero <br> - (0..10) <br> | 1. Pizzes <= 10 (true) | 2. Pizzes > 10 (false) <br> 3. Pizzes > 1 (false) <br> 4. No es un numero (Error)

- Fer la taula amb l'anàlisis de valors límit i casos vàlids i no vàlids.

| Paràmetres | Valors límit | Casos Vàlids | Casos No Valids |
| ---------- | ---------- | ---------- | ---------- |
| Pizzes | - Es un número <br>  - Entre 0 i 10 | 5. 1 <br> 6. 2 <br> 7. 9 <br> 8. 10 | 6. 0 <br> 7. 11
