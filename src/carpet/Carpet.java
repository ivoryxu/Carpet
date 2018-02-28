/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carpet;

/**
 *
 * @author user
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double l=8.5,w=6,c=19.95,C;
        
        C=l*w*c;
        System.out.println(C);
        
        C=(int)(C*100);
        System.out.println(C);
        
        C=C/100;
        System.out.println("The total cost is "+C+" dollars");
    }
    
}
