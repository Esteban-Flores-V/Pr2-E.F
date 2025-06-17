import java.awt.geom.Area;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String Seleccion = "";

        Seleccion = teclado.next();

        System.out.println("Que TP quieres ver: \n1. Clase Persona\n2. Funciones");

        if (Seleccion.equals("1"))

        if (Seleccion.equals("2"))
        {
            Funciones Ejercicio = new Funciones();

            while (true)
            {
                System.out.println("\n1. Mostrar Mensaje fijo\n" +
                        "2. Saludo Personalizado\n" +
                        "3. Area de un Rectangulo\n" +
                        "4. Convertir en Mayuscula\n" +
                        "5. Mostrar Menu\n" +
                        "6. Numero par o impar\n" +
                        "7. Calcular el cuadrado de un numero\n" +
                        "8. Factorial Recursivo\n" +
                        "9. Sumar multiples numeros\n" +
                        "10. Promedio de un array\n" +
                        "11. Buscar valor en array\n" +
                        "12. Contar ocurrencias\n" +
                        "13. Imprimir array de forma formateada\n" +
                        "14. Invertir array\n" +
                        "15. Estudiante con mejor nota\n");
                System.out.print("Selecciona el ejercicio / Ingrese 999 para salir: ");
                String input = "";
                input = teclado.next();

                switch (input) {
                    case "1":
                        Ejercicio.mostrarSaludo();
                        break;
                    case "2":
                        String nombre = "Esteban";
                        Ejercicio.saludar(nombre);
                        break;
                    case "3":
                        double base = 8.5;
                        double altura = 5.2;
                        double area = Ejercicio.calcularArea(base, altura);
                        System.out.println("El area del rectangulo es: " + area);
                        break;
                    case "4":
                        String texto = "Cavernicola conduciendo un ferrari";
                        Ejercicio.mayus(texto);
                        break;
                    case "5":
                        String opcion1 = "Enviar Mensajes";
                        String opcion2 = "Realizar llamada";
                        String opcion3 = "Bloquear usuario";
                        System.out.println(Ejercicio.menu(opcion1, opcion2, opcion3));
                        break;
                    case "6":
                        Ejercicio.esPar();
                        break;
                    case "7":
                        int num = 7;
                        System.out.println(Ejercicio.cuadrado(num));
                        break;
                    case "8":
                        int numF = 5;
                        int resultadoF = Ejercicio.factorialRecursivo(numF);
                        System.out.println("El factorial de " + numF + " es: " + resultadoF);
                        break;
                    case "9":
                        int resultadoSuma = Ejercicio.sumar(2,7,5,2,6);
                        System.out.println("El resultado de la suma es: " + resultadoSuma);
                        break;
                    case "10":
                        double Prom = Ejercicio.promedio(2.6, 3.4, 2.3, 7.7);
                        System.out.println("El Promedio de los doubles es: " + Prom);
                        break;
                    case "11":
                        int numBuscado = 3;
                        System.out.println(Ejercicio.buscarNum(numBuscado, 4,1,1,6,8,3,1,1));
                        break;
                    case "12":
                        String clave = "hola";
                        System.out.print("El numero de veces que se repite la palabra hola en el array es: ");
                        System.out.println(Ejercicio.contarString(clave, "hola", "pepe", "hola", "hola", "pelicano", "carlos"));
                        break;
                    case "13":
                        int[] nums = {2, 5, 7, 2, 1, 1, 8};
                        Ejercicio.arrayFormateado(nums);
                        break;
                    case "14":
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
                        break;
                    case "15":
                        String[] estudiantes = {"Pepe", "Juan", "Mario", "Ambar", "Agus", "Sofia"};
                        double[] notas = {6.3 , 3.0 , 9.5, 7.0, 7.0, 5.2};
                        String mejorAlumno = Ejercicio.estudianteTop(estudiantes, notas);
                        System.out.println("El estudiante con la mejor nota es: " + mejorAlumno);
                        break;
                    case "999":
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
                if (input.equals("999"))
                    break;

            }
        }
    }
}