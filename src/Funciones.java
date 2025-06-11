import java.util.*;

public class Funciones {
    // Ejercicio 1
    public void mostrarSaludo()
    {
        String MSG = "Hola Mundo";
        System.out.println(MSG);
    }

    // Ejercicio 2
    public void saludar(String nombre)
    {
        System.out.println("Hola, " + nombre);
    }

    // Ejercicio 3
    public double calcularArea(double base, double altura)
    {
        double area = (base * altura);
        return area;
    }

    // Ejercicio 4
    public void mayus(String texto)
    {
        String mayuscula = texto.toUpperCase();
        System.out.println(mayuscula);
    }

    // Ejercicio 5
    public String menu(String opcion1, String opcion2, String  opcion3) {
        System.out.println("Selecciona alguna opcion");
        String msg = "1." + opcion1 + "\n2." + opcion2 + "\n3." + opcion3;
        String menu = msg;
        return menu;
    }

    // Ejercicio 6
    public void esPar () {
        int num = 0;
        Scanner ingresar = new Scanner(System.in);
        String teclado = "";
        boolean esPar = false;

        System.out.println("Ingresa un numero");
        teclado = ingresar.next();
        try {
            num = Integer.parseInt(teclado);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Ingresá un número");
            return;
        }

        if (num % 2 == 0) {
            esPar = true;
            System.out.println("En efecto es Par");
        } else {
            System.out.println("Nono esto no es par");
        }
    }

    // Ejercicio 7
    public String cuadrado (int num) {
        int cuadrado = num * num;
        String C = "El cuadrado de 7 es: " + String.valueOf(cuadrado);
        return C;
    }

    // Ejercicio 8
    public int factorialRecursivo(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorialRecursivo(num-1);
        }
    }

    // Ejercicio 9
    public static int sumar(int... numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    // Ejercicio 10
    public static double promedio (double... nums) {
        double suma = 0;
        double prom = 0;
        for (double n : nums) {
            suma += n;
            prom =  suma / nums.length;
        }
        return prom;
    }

    // Ejercicio 11
    public static boolean buscarNum(int numBuscado, int... array) {
        for (int num : array) {
            if (num == numBuscado) {
                return true;
            }
        }
        return false;
    }

    // Ejercicio 12
    public static int contarString(String clave, String... array) {
        int frecuencia = 0;
        for (String palabra : array) {
            if (palabra.equals(clave))
                frecuencia++;
        }
        return frecuencia;
    }
}
