/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package structured_programming;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/**
 *
 * @author elvis
 */
public class compile {


public static void prn(String message){
    System.out.println(message);
}

public static void main(String[] args) {
    // TODO code application logic here
    String [] list = {"Hello","My","Friends","How","Are","You"};
    String sentence = "Hey Hello My How";
    for(int n=0; n<=6; n++)
    {
        String m=list[n];
    if(searchWordinString(sentence, m))
    {//prn("exists");
        
    }
    else
        { //prn("don't exists");
            
        }
    }
}

public static boolean searchWordinString(String sentence,String list){
    StringTokenizer test = new StringTokenizer(sentence);
    String element ="first iteration";
    while(!element.equals(" ")){
        try{
            element = test.nextElement().toString();
            prn(element);
            for(int index=0;index<8;index++){
                while(element.equals(list)){
                    prn(element+"="+list);
                    return true;
                }
                
            }
            
        }
        catch(NoSuchElementException e){
            //prn("Error: don't exist more words , bye");
            element="";
        }
    }
    return false;
}
}
