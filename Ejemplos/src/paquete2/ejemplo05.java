/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;
//import paquete2.Ejemplo02;

/**
 *
 * @author LAB.ELECT
 */
public class ejemplo05 {

    public static void main(String[] args) {
        int[] edades = {10, 9, 20, 17, 18, 19, 15};
        String cadenaFinal = "";
        for (int i = 0; i < edades.length; i++) {
            int edad = edades[i];
            String mensaje = ejemplo02.obtenerTipo(edad);
            cadenaFinal = String.format("%sEdad:%d %s\n", cadenaFinal, edad, mensaje);
            // para que solo no salga una sola edad,colocamos un %s y agragamos 
            //cadenaFinal y asi presentara todas las edades 
        }
        System.out.printf("%s\n", cadenaFinal);

    }
}
