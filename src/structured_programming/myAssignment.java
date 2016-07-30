
package structured_programming;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.*;
public class myAssignment extends JFrame{
    JTextField text;
    JLabel label;
    public myAssignment()
    {
        super("COMPILER ASSIGNMENT");
        setLayout(new FlowLayout());
        label = new JLabel("Enter the name of file and click enter :");
        add(label);
        text=new JTextField(20);
        add(text);
        Handler handle=new Handler();
        text.addActionListener(handle);
        
    }
    private class Handler implements ActionListener
    {
        public void actionPerformed(ActionEvent e){
                String filename="";
                if(e.getSource()==text)
                {
                    filename=String.format(e.getActionCommand());
                     String read;
        FileReader txtbk;
       BufferedReader bufferedread;
          try{
              String[] subject={"It", "construction", "text", "This", "compiler", "codes", "text", "program"};
	      String[] attribute={"studies","designing","composed", "translated", "interprete", "tranlate",  "called", "automates","run", "optimize", "written",  "creates"};
              String[] object={"texts", "language", "compiler", "computer", "instruction", "resources" };
              txtbk = new FileReader(filename);
              bufferedread = new BufferedReader(txtbk);
        while ((read =bufferedread.readLine()) != null)
        {
            StringTokenizer token_book=new StringTokenizer(read, " ");
            while(token_book.hasMoreTokens()){
            String word=token_book.nextToken();
                if(word.equals(subject[0])||word.equals(subject[1])||word.equals(subject[2])||word.equals(subject[3])
                        ||word.equals(subject[4])||word.equals(subject[5])||word.equals(subject[6])||word.equals(subject[7])
                        ||word.equals(attribute[0])||word.equals(attribute[1])||word.equals(attribute[2])||word.equals(attribute[3])
                            ||word.equals(attribute[4])||word.equals(attribute[5])||word.equals(attribute[6])||word.equals(attribute[7])
                            ||word.equals(attribute[8])||word.equals(attribute[9])||word.equals(attribute[10])||word.equals(attribute[11])
                            ||word.equals(object[0])||word.equals(object[1])||word.equals(object[2])||word.equals(object[3])
                            ||word.equals(object[4])||word.equals(object[5])
                        )
                {
                    System.out.print(word+",");
                }
                else if
                (word.equals("."))
                {
                 System.out.println();
                }
                else
                {
                    System.out.print(word+" ");
                }
                
            }
            }
         bufferedread.close();
       }
          catch(Exception error){
          System.out.println(error.getMessage());                      
       }
                }
              
        }
    }
    public static void main(String[] args)
    {
        myAssignment assignment=new myAssignment();
        assignment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        assignment.setVisible(true);
        assignment.setSize(500,200);
    }
}
