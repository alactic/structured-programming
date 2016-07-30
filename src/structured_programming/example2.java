/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structured_programming;

/**
 *
 * @author elvis
 */
public class example2 {
    
    public static void main(String[] args) {
    outer();
    }
     static void star()
    {
        System.out.print("*");
    }
    
    static void inner()
    {
        for(int j=1; j<=3;j++)
        {
           star();
        }
        System.out.println();
    }
    
     static void outer()
    {
        for(int i=1; i<=4;i++)
        {
           inner();
        }
        }
}