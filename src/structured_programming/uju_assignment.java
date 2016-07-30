package structured_programming;
import javax.swing.JOptionPane;
import java.util.StringTokenizer;
import java.io.FileReader;
import java.io.BufferedReader;



 public class uju_assignment
 {
    public static void main(String[] args) 
    {
        String myfile=JOptionPane.showInputDialog("WHAT IS THE NAME OF THE FILE: (eg. file.txt)");
        String read;
        FileReader txtbk;
       BufferedReader bufferedread;
          try{
              String[] subject={"It", "construction", "text", "This", "compiler", "codes", "text", "program"};
	      String[] attribute={"studies","designing","composed", "translated", "interprete", "tranlate",  "called", "automates","run", "optimize", "written",  "creates"};
              String[] object={"texts", "language", "compiler", "computer", "instruction", "resources" };
              txtbk = new FileReader(myfile);
              bufferedread = new BufferedReader(txtbk);
        while ((read =bufferedread.readLine()) != null)
        {
            StringTokenizer token_book=new StringTokenizer(read, " ");
            while(token_book.hasMoreTokens()){
            String token_word=token_book.nextToken();
                if(token_word.equals(subject[0])||token_word.equals(subject[1])||token_word.equals(subject[2])||token_word.equals(subject[3])
                        ||token_word.equals(subject[4])||token_word.equals(subject[5])||token_word.equals(subject[6])||token_word.equals(subject[7])
                        ||token_word.equals(attribute[0])||token_word.equals(attribute[1])||token_word.equals(attribute[2])||token_word.equals(attribute[3])
                            ||token_word.equals(attribute[4])||token_word.equals(attribute[5])||token_word.equals(attribute[6])||token_word.equals(attribute[7])
                            ||token_word.equals(attribute[8])||token_word.equals(attribute[9])||token_word.equals(attribute[10])||token_word.equals(attribute[11]))
                {
                    System.out.print(token_word+",");
                }else
                    if(token_word.equals(object[0])||token_word.equals(object[1])||token_word.equals(object[2])||token_word.equals(object[3])
                            ||token_word.equals(object[4])||token_word.equals(object[5]))
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
         bufferedread.close();
       }catch(Exception e){
          System.out.println(e.getMessage());                      
       }

     }
 }
