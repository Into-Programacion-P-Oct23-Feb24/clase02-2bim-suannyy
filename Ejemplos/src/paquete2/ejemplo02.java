/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author LAB.ELECT
 */
public class ejemplo02 {

    public static String obtenerTipo(int miEdad) {
        String cadena = "Devolver valor";
        if (miEdad >= 18) {
            cadena = ("la edad ingresada pertenece a mayor de edad");
        } else {
            if (miEdad >= 12 && miEdad < 18) {
                cadena = ("la edad ingresada pertenece a un adolescente");
            } else {
                cadena = ("la edad ingresada es de un niño");

            }

        }
        return cadena;
    }
}
