package structured_programming;
import java.io.*;
import java.util.StringTokenizer;



 public class Compiler
 {
    public static void main(String[] args) 
    {
        
        String[] subject={"program", "it", "text", "This", "iig", "codes",
                           "text", "program"};
	String[] attributes={"composed", "written", "translated", "interprete",  "called",
                             "automates","run", "optimize", "tranlate", "creates"};
        String[] object={"texts", "language", "jggj", "computer", "instruction",
                           "resources","but" };
       System.out.println("Reading File from note.txt file\n\n");
       //Name of the file
       String fileName="note.txt";
       try{

          //Create object of FileReader
          FileReader inputFile = new FileReader(fileName);

          //Instantiate the BufferedReader Class
          BufferedReader bufferReader = new BufferedReader(inputFile);

          //Variable to hold the one line data
          String line;
          
                  
          // Read file line by line and print on the console
          while ((line = bufferReader.readLine()) != null)   {
              
                    
              StringTokenizer stk=new StringTokenizer(line, " ");
              
              int i=0;
            while(stk.hasMoreTokens()){
                
            String token=stk.nextToken();
            if(token.equals(subject[i])||token.equals(attributes[i])||token.equals(object[i])
               ||token.equals(subject[i+1])||token.equals(attributes[i+1])||token.equals(object[i+1])
               ||token.equals(subject[i+2])||token.equals(attributes[i+2])||token.equals(object[i+2])
               ||token.equals(subject[i+3])||token.equals(attributes[i+3])||token.equals(object[i+3])
               ||token.equals(subject[i+4])||token.equals(attributes[i+4])||token.equals(object[i+4])
               ){
              System.out.print(token+",");
            }else if(token.equals(attributes[6])){
              System.out.print(token+",");
            }else if(token.equals(object[6])){
              System.out.print(token+",");
            }else if(token.equals(".")){
              System.out.println();
            }
            else{
              System.out.print(token+" ");
            }
              
            }
	
                       
       }
        }catch(Exception e){
          System.out.print("Error" + e.getMessage());                      
       }

     }
  }
