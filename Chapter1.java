public class Chapter1 {
    public static void main(String[] args) {
        
    
        System.out.println("Welcome to learning Java now");

        for (int i = 0; i <5; i++) {
            System.out.println("i love java");
        }

        System.out.println(((7.5 * 6.5) -(4.5*3))/(47.5-5.5) );
        System.out.println(add1(10));

    } 
    public static int add1(int m) {
        // base case
        if (m == 1) {
            return 1;
        } else {
            return add1(m-1) + m;
        }
        
    }


}
