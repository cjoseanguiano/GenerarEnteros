/*
13. Generar enteros de 3 en 3 comenzando por 2 hasta el valor máximo menor que 30. Calculando
la suma de los enteros generados que sean divisibles por 5.
 */
package generarenteros;

/**
 *
 * @author carlosjoseanguiano
 */
public class GenerarEnteros {

    public static void main(String[] args) {
        int suma = 0;

        for (int i = 2; i < 30; i = i + 2) {
            if (Divisible(i) == true) {
                suma = suma + i;
            }
            System.out.println("La suma de los valores es : " + suma);
        }

    }

    public static boolean Divisible(int valor) {
        boolean valorDivisible = false;

        if ((valor % 5) == 0) {
            valorDivisible = true;
            return valorDivisible;
        } else {
            System.out.println("Numero : " + valor + " No divisible");
            return valorDivisible;
        }
    }
}
