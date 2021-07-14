
package test;

import dominio.Empleado;
import dominio.Fecha;
import java.util.Scanner;


public class TestEmpleadoFecha {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Fecha fNacimiento;
        Fecha fIngreso;
        Empleado empleado1; 
        int anio,mes,dia;
        String nombre; 
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese fecha de nacimiento:");
        System.out.println("Año:");
        anio = entrada.nextInt();
        System.out.println("Mes:");
        mes = entrada.nextInt();
        System.out.println("Día:");
        dia= entrada.nextInt();
        //objeto de tipo fecha
        fNacimiento = new Fecha (anio, mes, dia); 
        System.out.println("Fecha de Ingreso a la Empresa ");
        System.out.println("Año:");
        anio = entrada.nextInt();
        System.out.println("Mes:");
        mes = entrada.nextInt();
        System.out.println("Día:");
        dia= entrada.nextInt();
        //objeto de tipo fecha
        fIngreso = new Fecha (anio, mes, dia);
        
        //objeto de tipo empleado 
        empleado1 = new Empleado(nombre,fNacimiento,fIngreso); 
        
        empleado1.verDatos();
//        System.out.println(empleado1); 

        
        
        
    }
    
}
