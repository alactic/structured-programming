package structured_programming;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;



 public class My_compiler
 {
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Please, enter the name of the file: ");
        String compiler_note=input.nextLine();
        String note=compiler_note;
        System.out.print("\n\n ");
        
        String[] SUBJECT={"Compiler", "it", "program", "text", "This", "compiler", "codes", "text", "program"};
	String[] ATTRIBUTE={"processed", "composed","interprete",  "called",  "written", "translated", "automates","run", "optimize", "tranlate", "creates"};
        String[] OBJECT={"texts", "language", "compiler", "computer", "instruction", "resources" };
       
          try{
          FileReader get_compiler_note = new FileReader(note);
          BufferedReader getSentence = new BufferedReader(get_compiler_note);
          String text;
          while ((text = getSentence.readLine()) != null)   {
              
                    
              StringTokenizer tokeniser=new StringTokenizer(text, " ");
            while(tokeniser.hasMoreTokens()){
                
            String getString=tokeniser.nextToken();
            if(getString.equals(SUBJECT[1])||getString.equals(SUBJECT[2])
              ||getString.equals(SUBJECT[3])||getString.equals(SUBJECT[4])
              ||getString.equals(SUBJECT[5])||getString.equals(SUBJECT[6])
              ||getString.equals(SUBJECT[7])||getString.equals(SUBJECT[8])
              ||getString.equals(SUBJECT[0])||getString.equals(ATTRIBUTE[1])
              ||getString.equals(ATTRIBUTE[2])||getString.equals(ATTRIBUTE[3])
              ||getString.equals(ATTRIBUTE[4])||getString.equals(ATTRIBUTE[5])
              ||getString.equals(ATTRIBUTE[6])||getString.equals(ATTRIBUTE[7])
              ||getString.equals(ATTRIBUTE[8])||getString.equals(ATTRIBUTE[9])
              ||getString.equals(ATTRIBUTE[10])||getString.equals(ATTRIBUTE[0])
              ||getString.equals(OBJECT[1])||getString.equals(OBJECT[2])
              ||getString.equals(OBJECT[3])||getString.equals(OBJECT[4])
              ||getString.equals(OBJECT[5])||getString.equals(OBJECT[0]))
            {
              System.out.print(getString+", ");
            }else if(getString.equals(".")){
                System.out.print(". \n");
            }
            else{
              System.out.print(getString+" ");
            } 
            }
       }
         getSentence.close();
       }catch(Exception e){
          System.out.println("Error while reading file line by line:" + e.getMessage());                      
       }

     }
  }
