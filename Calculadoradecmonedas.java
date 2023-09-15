/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoradecmonedas;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculadoradecmonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner lectura = new Scanner(System.in);
       final double euro = 18.21;
       final double dolares = 17.07;
       final double yen = 0.12;
       final double libras = 21.18;
       
       System.out.println("ingresa una cantidad de pesos");
       double pesos = lectura.nextInt();
       
       System.out.println("euros: " + pesos / 18.21 );
       System.out.println("dolares: " + pesos / 17.07 ); 
       System.out.println("yen: " + pesos / 0.12 );
       System.out.println("libras: " + pesos / 21.18 ); 
               
        
    }
    
}
