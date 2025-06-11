import java.awt.geom.Area;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Funciones Ejercicio = new Funciones();

        Scanner teclado = new Scanner(System.in);
        String input = "";

        while (true)
        {
            System.out.println("Selecciona el ejercicio / Ingrese 999 para salir");
            input = teclado.next();

            if (input.equals("999")) {
                break;
            }

            if (input.equals("1")) {
                Ejercicio.mostrarSaludo();
            }

            if (input.equals("2")) {
                String nombre = "Esteban";
                Ejercicio.saludar(nombre);
            }

            if (input.equals("3")) {
                double base = 8.5;
                double altura = 5.2;
                double area = Ejercicio.calcularArea(base, altura);
                System.out.println("El area del rectangulo es: " + area);
            }

            if (input.equals("4")) {
                String texto = "Cavernicola conduciendo un ferrari";
                Ejercicio.mayus(texto);
            }

            if (input.equals("5")) {
                String opcion1 = "Enviar Mensajes";
                String opcion2 = "Realizar llamada";
                String opcion3 = "Bloquear usuario";
                System.out.println(Ejercicio.menu(opcion1, opcion2, opcion3));
            }

            if (input.equals("6")) {
                Ejercicio.esPar();
            }

            if (input.equals("7")) {
                int num = 7;
                System.out.println(Ejercicio.cuadrado(num));
            }

            if (input.equals("8")) {
                int num = 5;
                int resultado = Ejercicio.factorialRecursivo(num);
                System.out.println("El factorial de " + num + " es: " + resultado);
            }
        }
    }
}