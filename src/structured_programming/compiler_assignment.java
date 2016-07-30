package structured_programming;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;



 public class compiler_assignment
 {
    public static void main(String[] args) 
    {
       String read;
       String filename;
       String name;
       FileReader textbook;
       BufferedReader readline;
          try{
              System.out.print("NAME OF FILE::: ");
              Scanner myinput=new Scanner(System.in);
              filename=myinput.nextLine();
              name=filename;
              textbook = new FileReader(name);
              readline = new BufferedReader(textbook);
        String[] sub={"it", "text", "This", "Compiler", "codes", "text", "program"};
	String[] attr={"composed", "translated", "interprete", "tranlate",  "called", "automates","run", "optimize", "written",  "creates"};
        String[] obj={"texts", "language", "compiler", "computer", "instruction", "resources" };
        while ((read =readline.readLine()) != null)
        {
            StringTokenizer token_book=new StringTokenizer(read, " ");
            while(token_book.hasMoreTokens()){
            String token_word=token_book.nextToken();
            switch(0)
            {
                default:
                if(token_word.equals(sub[0])||token_word.equals(sub[1])||token_word.equals(sub[2])||token_word.equals(sub[3])
                        ||token_word.equals(sub[4])||token_word.equals(sub[5])||token_word.equals(sub[6]))
                {
                    System.out.print(token_word+",");
                }else
                    if(token_word.equals(attr[0])||token_word.equals(attr[1])||token_word.equals(attr[2])||token_word.equals(attr[3])
                            ||token_word.equals(attr[4])||token_word.equals(attr[5])||token_word.equals(attr[6])||token_word.equals(attr[7])
                            ||token_word.equals(attr[8])||token_word.equals(attr[9]))
                {
                    System.out.print(token_word+",");
                }else
                    if(token_word.equals(obj[0])||token_word.equals(obj[1])||token_word.equals(obj[2])||token_word.equals(obj[3])
                            ||token_word.equals(obj[4])||token_word.equals(obj[5]))
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
	
                       
       }
         readline.close();
       }catch(Exception err){
          System.out.println(err.getMessage());                      
       }

     }
  }
