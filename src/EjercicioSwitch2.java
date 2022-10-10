
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gisela.basantes
 */
public class EjercicioSwitch2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        
        
        
            Scanner teclado= new Scanner(System.in);
            int dia;
            
            System.out.println("Dime el dia de la semana");
            dia=Integer.parseInt(teclado.nextLine());
            
            switch(dia){
                case 1,2,4,5: 
                    System.out.println("Hoy toca programacion");
                    break;
                    
                case 3,6,7:
                    System.out.println("Hoy no hay programacion!!");
                    break;
                    
                default: 
                    System.out.println("ERROR");
                    
                
                
                
                
                
                
            }
                    
            
            
            
            
            
            
    }
    
}
