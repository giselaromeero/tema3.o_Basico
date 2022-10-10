/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gisela.basantes
 */
public class TipoDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int unentero=15;
        System.out.println(unentero);
        String unlong = null;
        System.out.println("Valor de unlong:n" +unlong);
        
        float unfloat=3.14f; 
        System.out.println("valor de unfloat: "+unfloat);
        
        double undouble;
        undouble=3.141521; 
        System.out.println("Valor de undouble:" + undouble);
        System.out.printf("Valor de un double: %.3f\n", undouble);
        
        
        //Cadena y caracteres
        String cadena= "Hoy es viernes!!";
  
        char letra1='G';
        char letra2='I';
        char letra3='S';
        char letra4='E';   
        
        System.out.println("Valor de cadena:" +cadena);
        System.out.println("Mi nombre es " +letra1+letra2+letra3+letra4);
        
        // operaciones aritmeticas basicas 
        
        int x=8;
        int y=6;
        int z=0;
        int resultado;
        resultado= x+y;
        System.out.println("Resultado de sumar x e y es:"+resultado);
        
        resultado=x*y;
        System.out.println("Resultado de multilicar x e y es:"+resultado);
        
        resultado=(x+y-3)*2;
        System.out.println("Resultado de (x+y-3)*2 es:"+resultado);
        resultado=x+y*3;
        System.out.println("Resultado de x+y*3 es:"+resultado);
        
        
        // Truncar division a entero
        resultado=x/y;
        System.out.println("Si divido y/x sale:" +resultado);
        double resultadoDouble=x/y;
        System.out.println("Si divido y/x sale:" +resultadoDouble);
        
        
        

        
        
        
        
        
        
        
        
        
        
                
        
        
        
        
        
        
    }
    
}
