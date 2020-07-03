import java.util.Scanner;

public class Tablas_de_multiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contador = 1;

        System.out.println("Introduzca un número: ");
        int tabla = teclado.nextInt();


        while (contador <= 10){

            int resultado = tabla * contador;
            System.out.println(contador + " por " + tabla + " es: " + resultado);
            contador = contador + 1;
        }
    }
}
