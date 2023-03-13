/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7.cap4;

import java.util.Scanner;

public class Ejercicio7Cap4 {

    public static void main(String[] args) {
        double a,b;
        Scanner entrada = new Scanner(System.in);
        

        System.out.print("Ingrese el valor de A: ");
        a = entrada.nextDouble();
        System.out.print("Ingrese el valor de B: ");
        b = entrada.nextDouble();

        if (a > b) {
            System.out.println("A es mayor que B");
        } else if (a < b) {
            System.out.println("A es menor que B");
        } else {
            System.out.println("A es igual a B");
        }
    }
}