import java.awt.geom.Area;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        F_LVL1 Ejercicio = new F_LVL1();

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
        }
    }
}