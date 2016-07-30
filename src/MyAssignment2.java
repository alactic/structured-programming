/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elvis
 */
public class MyAssignment2 {
    static int temp;
    static void write(int j)
    {
        System.out.print(j);
    }
    static void space()
    {
        System.out.print(" ");
    }
    static void inner(int j)
    {
        if(j==temp)
        {
            write(j);
        }else
        {
            write(j);
            inner(j+1);
        }
    }
    
    static void innerspace(int j)
    {
        if(j==temp)
        {
            space();
            inner(1);
            outerspace(j);
            //outerspace2(j);
           // inner(1);
            System.out.println();
        }else
        {
            space();
            innerspace(j-1);
            
        }    
    }
    
    static void outerspace(int j)
    {
       if(j==5)
        {
            space();
            inner(1);
           // System.out.println();
        }else
        {
            space();
            outerspace(j+1);
            
        }    
    }
    
    
    static void outer(int i)
    {
        temp=i;
        if(i==5)
        {
            inner(1);
            innerspace(5);
            }else
        {
            inner(1);
            innerspace(5);
            outer(i+1);
           }
    }
    public static void main(String args[])
    {
        outer(1);
    }
}
