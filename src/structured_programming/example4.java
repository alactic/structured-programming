package structured_programming;
public class example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        outer(1);
    }
    public static void star(int i){
        System.out.print(i);
    }
    public static void inner(int j){
        if(j==3){
            star(j);
            System.out.println();
        }else{
            star(j);
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
