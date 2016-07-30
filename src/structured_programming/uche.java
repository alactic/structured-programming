/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class uche
 {
    public static void main(String[] args) 
    {
       String read_buffer;
       String user;
       StringTokenizer stringtoken;
       FileReader readfile;
       Scanner userinput;
       BufferedReader buff;
       System.out.print("enter the name of file: ");
              
               try{
                   userinput=new Scanner(System.in);
              user=userinput.nextLine();
              readfile = new FileReader(user);
              buff = new BufferedReader(readfile);
        String[] SUBJECT={"it", "text", "This", "compiler", "codes", "text", "code"};
	String[] ATTRI={"composed", "translated", "interprete", "tranlate",  "called", "automates","run", "optimize", "written",  "creates"};
        String[] OBJ={"texts", "program","language", "compiler", "computer", "instruction", "resources" };
        while ((read_buffer =buff.readLine()) != null)
        {
            stringtoken=new StringTokenizer(read_buffer, " ");
            while(stringtoken.hasMoreTokens()){
            String token_word=stringtoken.nextToken();
            
                if(token_word.equals(SUBJECT[0])||token_word.equals(SUBJECT[1])||token_word.equals(SUBJECT[2])||token_word.equals(SUBJECT[3])
                        ||token_word.equals(SUBJECT[4])||token_word.equals(SUBJECT[5])||token_word.equals(SUBJECT[6]))
                {
                    System.out.print(token_word+",");
                }else
                    if(token_word.equals(ATTRI[0])||token_word.equals(ATTRI[1])||token_word.equals(ATTRI[2])||token_word.equals(ATTRI[3])
                            ||token_word.equals(ATTRI[4])||token_word.equals(ATTRI[5])||token_word.equals(ATTRI[6])||token_word.equals(ATTRI[7])
                            ||token_word.equals(ATTRI[8])||token_word.equals(ATTRI[9])||token_word.equals(OBJ[0])||token_word.equals(OBJ[1])||token_word.equals(OBJ[2])||token_word.equals(OBJ[3])
                            ||token_word.equals(OBJ[4])||token_word.equals(OBJ[5])||token_word.equals(OBJ[6]))
                {
                    System.out.print(token_word+",");
                }
                else if
                (token_word.equals("."))
                {
                 System.out.println();
                }
                else
                {
                    System.out.print(token_word+" ");
                }
                
            }
                       
       }
       }catch(Exception errors){
          System.out.println(errors.getMessage());                      
       }

     }
  }
