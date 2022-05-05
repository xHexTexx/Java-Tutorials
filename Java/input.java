import java.util.Scanner;

public class input {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine() ;
        System.out.println(name) ;

        Integer num = sc.nextInt() ;
        System.out.println(num) ;

        Float f = sc.nextFloat() ;
        System.out.format("%.2f",f) ;
        System.out.format("%s" , "Hello") ;
    }
}
