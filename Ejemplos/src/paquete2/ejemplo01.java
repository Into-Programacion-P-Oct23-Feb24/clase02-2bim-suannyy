/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author LAB.ELECT
 */
public class ejemplo01 {

    public static void main(String[] args) {
        int edad = 12;
        if (edad >= 18) {
            System.out.println("la edad ingresada pertenece a mayor de edad");
        } else {
            if (edad >= 12 && edad < 18) {
                System.out.println("la edad ingresada pertenece a un adolescente");
            } else {
                System.out.println("la edad ingresada es de un niño");
            }

        }

    }
}
