
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gisela.basantes
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado= new Scanner(System.in);
        double sueldoBase; 
        double venta1,venta2,venta3; 
        int porcentajeComision = 10; 
        
        System.out.print("Importe venta1:");
        venta1= teclado.nextDouble();
        System.out.print("Importe venta2:");
        venta2 = teclado.nextDouble();
        System.out.print("Importe venta3:");
        venta3 = teclado.nextDouble();
        
        double comision1 =venta1*(porcentajeComision/100);
        double comision2 = venta2*(porcentajeComision/100);
        double comision3 = venta3*(porcentajeComision/100);
        
        
        
        
        
        
        
        
    }
    
}
