/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mypackage;

//import static structured_programming.Lesson7.temp;



/**
 *
 * @author elvis
 */
public class Outer{
         public static void main(String args[])
    {
        
    }

    static Inner obj=new Inner();
     public static void outer1(int i){
        obj.temp=i;
        if(i==5){
            obj.inner1(1);
            obj.inner2(i);
            obj.inner3(i);
            obj.inner4(i);
            System.out.println();
        }else{
            obj.inner1(1);
            obj.inner2(i);
            obj.inner3(i);
            obj.inner4(i);
            System.out.println();
            outer1(i+1);
        }
    }
    
   public static void outer2(int i){
        obj.temp=i;
        if(i==5){
            obj.inner3(i);
            System.out.println();
        }else{
            obj.inner3(i);
            System.out.println();
            outer2(i+1);
        }
    }
    public static void outer5(int i){
        obj.temp=i;
        if(i==5){
            obj.inner5(1);
            obj.inner6(6-i);
            obj.inner3(i);
            obj.inner7(i);
            System.out.println();
        }else{
            obj.inner5(1);
            obj.inner6(6-i);
            obj.inner3(i);
            obj.inner7(i);
            System.out.println();
            outer5(i+1);
        }
    }
}
