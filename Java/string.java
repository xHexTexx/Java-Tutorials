public class string {
    public static void main(String[] args) {
        
        String a = "ABCD" ;
        System.out.println(a.charAt(0)) ;

        String x = "1000" ;
        String y = "2000" ;
        System.out.println(Integer.parseInt(x) + Integer.parseInt(y)) ;

        Integer z = 1000 ;
        System.out.println(Integer.toString(z) + "1000") ;
        
        Boolean b =  z instanceof Integer ;

        System.out.println(b) ;
    }
}
