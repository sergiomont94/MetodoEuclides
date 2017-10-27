/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoEuclides;

/**
 *
 * @author senpai
 */
public class Calculos_Matematicos {
    
    int x,y,z;

//    public Calculos_Matematicos(int x, int y,int z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
    
    public static int mcd(int x, int y, int z){
        if (z==0) {
                 return x;
            }else{
            return mcd(z,y,x%z);
        }
            
    }
    
    
}
