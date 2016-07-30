/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypackage;


/**
 *
 * @author elvis
 */

public class Inner {
     public static void main(String args[])
    {
        
    }
    static int temp;
    static void inner1(int j)
    {
        if(temp==5)
        {
            //do nothing
        }else{
            if(j==5-temp)
            {
                space();
            }else
            {
                space();
                inner1(j+1);
            }
        }
    }
    
    static void inner2(int j)
    {
        if(j==1)
        {
            write(j);
        }else{
            write(j);
            inner2(j-1);
        }
    }
    
    static void inner3(int j)
    {
        if(j==4+temp){
            write(j);
        }else{
            write(j);
            inner3(j+1);
        }
    }
    
    static void inner4(int j){
        if(j==1){
            write(j);
        }else{
            write(j);
            inner4(j-1);
        }
    }
   
    
    static void inner5(int j){
        if(temp==1){
            
        }else{
            if(j==temp-1){
                space();
            }else{
                space();
                inner5(j+1);
            }
        }
    }
    
    static void inner6(int j){
        if(j==1){
            write(j);
        }else{
            write(j);
            inner6(j-1);
        }
    }
    
    static void inner7(int j){
        if(j==5){
            write(j);
            
        }else{
            write(j);
            inner7(j+1);
        }
    }
    
    static void space()
    {
        System.out.print(" ");
    }
    static void write(int j){
        System.out.print(j);
    }
}
