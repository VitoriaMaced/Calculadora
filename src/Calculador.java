package Calcular;

import java.util.Scanner;


public class Calculador {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro numero: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("Somar: " + somar);
        System.out.println("Sub: " + subtrair);
        System.out.println("Mult: " + multiplicar);
        System.out.println("Div: " + dividir);

    }

    public static int somar(int a, int b){
        return a + b;
    }
    public static int subtrair(int a, int b){
        return a - b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }
    public static double dividir(double a, double b){
        return a / b;
    }

}


