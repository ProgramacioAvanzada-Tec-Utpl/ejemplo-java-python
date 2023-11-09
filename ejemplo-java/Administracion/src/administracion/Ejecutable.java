/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administracion;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutable {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        ArrayList<Hospital> hospitales = new ArrayList<>();
        String nombre;
        int numeroCamas;
        double presupuesto;
        boolean bandera = true;
        String salida;
        while (bandera) {
            System.out.println("Ingrese nombre del hospital");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el número de camas del hospital");
            numeroCamas = entrada.nextInt();
            System.out.println("Ingrese el presuesto del hospital");
            presupuesto = entrada.nextDouble();
            entrada.nextLine();
            Hospital hospital = new Hospital(nombre, numeroCamas,
                    presupuesto);
            hospitales.add(hospital);
            System.out.println("Desea salir del ciclo?, escriba (y) ");
            salida = entrada.nextLine();
            if (salida.equals("y")) {
                bandera = false;
            }
        }
        
        System.out.println("Listado de Hospitales");
        for (int i = 0; i < hospitales.size(); i++) {
            System.out.printf("%s\n", hospitales.get(i));
        }
        
        
    }
}
