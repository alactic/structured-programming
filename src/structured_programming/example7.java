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
import java.util.Scanner;
public class example7 {
    
    public static void main(String[] args)
    {
       double x1; 
       int n1;
       Scanner myinput=new Scanner(System.in);
       System.out.println("Enter the real number");
       x1=myinput.nextDouble();
       System.out.println("Enter the integer number");
       n1=myinput.nextInt();
       
       System.out.println("the value of cose "+ x1+" is "+cose(x1, n1));
       //System.out.println("the value of factorial "+ x1+" is "+fact(n1));
       //System.out.println("the value of expo "+ x1+" is "+expo(x1, n1));
       
    }
    static double power(double x, int n)
    {
        if(n==0)
        {
            return 1;
        }else
        {
            return x*power(x, n-1);
        }
    }
    static double fact(int n)
    {
        if(n==0)
        {
            return 1;
        }else
        {
            return (n*fact(n-1));
        }
    }
       static double cose(double x, int n)
       {
           double val1=0.0;
           double val2=0.0;
           double val3=0.0;
           
           if(n==0)
           {
               return 0;
           }else
           {
               val1=power(-1, (n-1));
               val2=power(x, (2*n-2));
               val3=fact(2*n-2);
               return ((val1*val2)/(val3))+cose(x, n-1);
           }
       }
       
       static double expo(double x, int n)
       {
           if(n==0)
           {
               return 1;
           }else
           {
               return ((power(x, n)/fact(n))+expo(x, n-1));
           }
       }
       
       static double sine(double x, int n)
       {
           if(n==1)
           {
               return x;
           }else
           {
               return ((power(-1, (n-1))
                       *power(x, (2*n-1)))/(fact(2*n-1)))+sine(x, n-1);
           }
       }
    }

