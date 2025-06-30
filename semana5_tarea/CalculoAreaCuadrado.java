/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana5_tarea;

/**
 * Programa que calcula el área de una figura geométrica el Cuadrado ingresando la base y la altura.
 * Usa tipos de datos float y boolean, e incluye validación básica de entrada. 
 * Autor: Heidy Johana Meza Licuy 
 */
import java.util.Scanner;

public class CalculoAreaCuadrado {
    public static void main(String[] args) {
        Scanner entrada_usuario = new Scanner(System.in);

        String nombre_usuario;
        float base, altura, area;
        boolean datos_validos = false;

        System.out.print("Ingrese su nombre: ");
        nombre_usuario = entrada_usuario.nextLine();

        System.out.println("Hola " + nombre_usuario + "!");

        System.out.print("Ingrese la base del cuadrado: ");
        if (entrada_usuario.hasNextFloat()) {
            base = entrada_usuario.nextFloat();

            System.out.print("Ahora ingrese la altura: ");
            if (entrada_usuario.hasNextFloat()) {
                altura = entrada_usuario.nextFloat();

                datos_validos = true;
                area = base * altura;
                System.out.println("El área es: " + area + " unidades cuadradas.");
            } else {
                System.out.println("Error: Ingrese un valor numérico válido para la altura.");
            }
        } else {
            System.out.println("Error: Ingrese un valor numérico válido para la base.");
        }

        System.out.println("¿Los datos ingresados fueron válidos? " + datos_validos);
        entrada_usuario.close();
    }
}

