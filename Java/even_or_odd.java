import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt() ;

        if( (num & 1) == 1){
            System.out.println("odd");
        }
        else {
            System.out.println("even");
        }

    }
}
