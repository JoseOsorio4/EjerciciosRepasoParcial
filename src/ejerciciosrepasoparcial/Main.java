package ejerciciosrepasoparcial;

import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {

	        try (Scanner sc = new Scanner(System.in)) {
				int opcion;

				do {

				    System.out.println("MENU");
				    System.out.println("1 Suma divisibles entre 4");
				    System.out.println("2 Factorial");
				    System.out.println("3 Contar positivos negativos y ceros");
				    System.out.println("4 Promedio de pares");
				    System.out.println("5 Suma de digitos");
				    System.out.println("6 Multiplo de 7 o 11");
				    System.out.println("7 Divisible entre 3 pero no 2");
				    System.out.println("8 Hora del dia");
				    System.out.println("9 Numero romano");
				    System.out.println("10 Calculadora");
				    System.out.println("11 Mayor menor diferencia");
				    System.out.println("12 Tabla de division");
				    System.out.println("13 Cantidad de digitos pares");
				    System.out.println("14 Numero triangular");
				    System.out.println("15 Promedio de negativos");
				    System.out.println("16 Multiplos de 6");
				    System.out.println("17 Potencia de 2");
				    System.out.println("18 Numero invertido");
				    System.out.println("19 Suma 1 a n par o impar");
				    System.out.println("20 Celsius a Fahrenheit");
				    System.out.println("0  Salir");

				    System.out.print("Seleccione opcion: ");
				    opcion = sc.nextInt();

				    switch (opcion) {

				        // EJERCICIO 1
				        // Suma de todos los números divisibles entre 4 desde 1 hasta n
				        case 1:
				            int n1, suma1 = 0;
				            System.out.print("Ingrese n: ");
				            n1 = sc.nextInt();

				            for (int i = 1; i <= n1; i++) {
				                if (i % 4 == 0) {
				                    suma1 += i;
				                }
				            }

				            System.out.println("Suma: " + suma1);
				            break;

				        // EJERCICIO 2
				        // Calcular el factorial de un número n
				        case 2:
				            int n2;
				            long factorial = 1;

				            System.out.print("Ingrese n: ");
				            n2 = sc.nextInt();

				            for (int i = 1; i <= n2; i++) {
				                factorial *= i;
				            }

				            System.out.println("Factorial: " + factorial);
				            break;

				        // EJERCICIO 3
				        // Contar cuántos números son positivos, negativos y ceros
				        case 3:
				            int cantidad, num;
				            int pos = 0, neg = 0, ceros = 0;

				            System.out.print("Cantidad de numeros: ");
				            cantidad = sc.nextInt();

				            for (int i = 1; i <= cantidad; i++) {
				                num = sc.nextInt();

				                if (num > 0) pos++;
				                else if (num < 0) neg++;
				                else ceros++;
				            }

				            System.out.println("Positivos: " + pos);
				            System.out.println("Negativos: " + neg);
				            System.out.println("Ceros: " + ceros);
				            break;

				        // EJERCICIO 4
				        // Calcular el promedio de números pares entre 1 y n
				        case 4:
				            int n4, suma4 = 0, cont4 = 0;

				            System.out.print("Ingrese n: ");
				            n4 = sc.nextInt();

				            for (int i = 1; i <= n4; i++) {
				                if (i % 2 == 0) {
				                    suma4 += i;
				                    cont4++;
				                }
				            }

				            if (cont4 != 0)
				                System.out.println("Promedio: " + (suma4 / cont4));
				            else
				                System.out.println("No hay pares");

				            break;

				        // EJERCICIO 5
				        // Sumar todos los dígitos de un número
				        case 5:
				            int n5, suma5 = 0;

				            System.out.print("Ingrese numero: ");
				            n5 = sc.nextInt();

				            while (n5 != 0) {
				                suma5 += n5 % 10;
				                n5 /= 10;
				            }

				            System.out.println("Suma de digitos: " + suma5);
				            break;

				        // EJERCICIO 6
				        // Determinar si un número es múltiplo de 7 o de 11
				        case 6:
				            int n6 = sc.nextInt();

				            if (n6 % 7 == 0 || n6 % 11 == 0)
				                System.out.println("Es multiplo");
				            else
				                System.out.println("No es multiplo");

				            break;

				        // EJERCICIO 7
				        // Mostrar números entre 1 y n divisibles entre 3 pero no entre 2
				        case 7:
				            int n7 = sc.nextInt();

				            for (int i = 1; i <= n7; i++) {
				                if (i % 3 == 0 && i % 2 != 0)
				                    System.out.println(i);
				            }

				            break;

				        // EJERCICIO 8
				        // Determinar si una hora corresponde a mañana, tarde o noche
				        case 8:
				            int hora = sc.nextInt();

				            if (hora < 12)
				                System.out.println("Mañana");
				            else if (hora < 18)
				                System.out.println("Tarde");
				            else
				                System.out.println("Noche");

				            break;

				        // EJERCICIO 9
				        // Convertir número del 1 al 5 a número romano
				        case 9:
				            int romano = sc.nextInt();

				            switch (romano) {
				                case 1: System.out.println("I"); break;
				                case 2: System.out.println("II"); break;
				                case 3: System.out.println("III"); break;
				                case 4: System.out.println("IV"); break;
				                case 5: System.out.println("V"); break;
				                default: System.out.println("Fuera de rango");
				            }

				            break;

				        // EJERCICIO 10
				        // Calculadora básica con switch
				        case 10:
				            int op = sc.nextInt();
				            int a = sc.nextInt();
				            int b = sc.nextInt();

				            switch (op) {
				                case 1: System.out.println("Suma: " + (a + b)); break;
				                case 2: System.out.println("Resta: " + (a - b)); break;
				                case 3: System.out.println("Multiplicacion: " + (a * b)); break;
				            }

				            break;

				        // EJERCICIO 11
				        // Mostrar mayor, menor y diferencia absoluta entre dos números
				        case 11:
				            int a1 = sc.nextInt();
				            int b1 = sc.nextInt();

				            int mayor = Math.max(a1, b1);
				            int menor = Math.min(a1, b1);
				            int dif = Math.abs(a1 - b1);

				            System.out.println("Mayor: " + mayor);
				            System.out.println("Menor: " + menor);
				            System.out.println("Diferencia: " + dif);

				            break;

				        // EJERCICIO 12
				        // Mostrar tabla de división de un número del 1 al 10
				        case 12:
				            int n12 = sc.nextInt();

				            for (int i = 1; i <= 10; i++) {
				                System.out.println(n12 + "/" + i + "=" + (n12 / i));
				            }

				            break;

				        // EJERCICIO 13
				        // Contar cuántos dígitos pares tiene un número
				        case 13:
				            int n13 = sc.nextInt();
				            int cont = 0;

				            while (n13 != 0) {
				                int dig = n13 % 10;
				                if (dig % 2 == 0) cont++;
				                n13 /= 10;
				            }

				            System.out.println("Digitos pares: " + cont);
				            break;

				        // EJERCICIO 14
				        // Determinar si un número es triangular
				        case 14:
				            int n14 = sc.nextInt();
				            int suma = 0, k = 1;

				            while (suma < n14) {
				                suma += k;
				                k++;
				            }

				            if (suma == n14)
				                System.out.println("Es triangular");
				            else
				                System.out.println("No es triangular");

				            break;

				        // EJERCICIO 15
				        // Calcular promedio de números negativos
				        case 15:
				            int n15 = sc.nextInt();
				            int suma15 = 0, cont15 = 0;

				            for (int i = 1; i <= n15; i++) {
				                int num15 = sc.nextInt();

				                if (num15 < 0) {
				                    suma15 += num15;
				                    cont15++;
				                }
				            }

				            if (cont15 > 0)
				                System.out.println("Promedio: " + (suma15 / cont15));
				            else
				                System.out.println("No hay negativos");

				            break;

				        // EJERCICIO 16
				        // Mostrar los primeros n múltiplos de 6
				        case 16:
				            int n16 = sc.nextInt();

				            for (int i = 1; i <= n16; i++) {
				                System.out.println(6 * i);
				            }

				            break;

				        // EJERCICIO 17
				        // Determinar si un número es potencia de 2
				        case 17:
				            int n17 = sc.nextInt();

				            while (n17 > 1 && n17 % 2 == 0) {
				                n17 /= 2;
				            }

				            if (n17 == 1)
				                System.out.println("Es potencia de 2");
				            else
				                System.out.println("No es potencia de 2");

				            break;

				        // EJERCICIO 18
				        // Invertir un número
				        case 18:
				            int n18 = sc.nextInt();
				            int inv = 0;

				            while (n18 != 0) {
				                inv = inv * 10 + (n18 % 10);
				                n18 /= 10;
				            }

				            System.out.println("Invertido: " + inv);
				            break;

				        // EJERCICIO 19
				        // Determinar si la suma de 1 a n es par o impar
				        case 19:
				            int n19 = sc.nextInt();

				            int suma19 = (n19 * (n19 + 1)) / 2;

				            if (suma19 % 2 == 0)
				                System.out.println("Par");
				            else
				                System.out.println("Impar");

				            break;

				        // EJERCICIO 20
				        // Convertir grados Celsius a Fahrenheit
				        case 20:
				            double c = sc.nextDouble();

				            double f = (c * 9 / 5) + 32;

				            System.out.println("Fahrenheit: " + f);
				            break;

				    }

				} while (opcion != 0);
			}
	        System.out.println("Programa finalizado");

	    }
	}