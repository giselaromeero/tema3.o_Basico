
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gisela.basantes
 */
public class ejercicio3_condicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        
        double nota1, nota2, nota3 ;
        System.out.println("Introducir nota 1 :");
        
         nota1 =Double.parseDouble(teclado.nextLine());
         System.out.println("Introducir nota 2 :");
         nota2 =Double.parseDouble(teclado.nextLine());
         System.out.println("Introduzca nota 3 :");
         nota3=Double.parseDouble(teclado.nextLine());
         
        double notamedia= (nota1*0.3)+ (nota2*0.3)+ (nota3*0.4); 
        System.out.println("Nota media :"+notamedia);
        
        
        
        
                
        
         
        
        
        
         
        
        
        
        
        
        
        
        
    }
    
}
