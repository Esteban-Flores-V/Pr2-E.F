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

            if (input.equals("9")) {
                int resultado = Ejercicio.sumar(2,7,5,2,6);
                System.out.println("El resultado de la suma es: " + resultado);
            }

            if (input.equals("10")) {
                double Prom = Ejercicio.promedio(2.6, 3.4, 2.3, 7.7);
                System.out.println("El Promedio de los doubles es: " + Prom);
            }

            if (input.equals("11")) {
                int numBuscado = 3;
                System.out.println(Ejercicio.buscarNum(numBuscado, 4,1,1,6,8,3,1,1));
            }

            if (input.equals("12")) {
                String clave = "hola";
                System. out.print("El numero de veces que se repite la palabra hola en el array es: ");
                System.out.println(Ejercicio.contarString(clave, "hola", "pepe", "hola", "hola", "pelicano", "carlos"));
            }

            if (input.equals("13")) {
                int[] nums = {2, 5, 7, 2, 1, 1, 8};
                Ejercicio.arrayFormateado(nums);
            }

            if (input.equals("14")) {
                int[] array = {6, 7, 1, 5, 4, 4 ,1 ,2 ,9};
                int[] invertido = Ejercicio.invertirArray(array);

                System.out.print("[");
                for (int i = 0; i < invertido.length ; i++) {
                    System.out.print(invertido[i]);
                    if (i < invertido.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
        }
    }
}