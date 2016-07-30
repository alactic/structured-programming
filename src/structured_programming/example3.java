package structured_programming;

public class example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        outer(1);
    }
    public static void star(){
        System.out.print("*");
    }
    public static void inner(int j){
        if(j==3){
            star();
            System.out.println();
        }else{
            star();
            inner(j+1);
        }
    }
    public static void outer(int i){
        if(i==4){
            inner(1);
        }else{
            inner(1);
            outer(i+1);
        }
    }
    
    
    
}
