/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoEuclides;
import MetodoEuclides.Calculos_Matematicos;
import java.util.Scanner;
/**
 *
 * @author senpai
 */
public class Matematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
                
        System.out.println("Ingrese el primero numero");
        int x = scan.nextInt();
        System.out.println("Ingrese el segundo numero");
        int y = scan.nextInt();
        System.out.println("Ingrese el tercer numero");
        int z = scan.nextInt();
        
        Calculos_Matematicos.mcd(x, y, z);
        
        System.out.println("La MCD es de  "+Calculos_Matematicos.mcd(x, y, z));
        
                
    }
    
}
