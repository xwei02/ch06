public class Practice9 {
    public static void pyramid(int n){
        String o ="";
        for (int i = 1; i <= n; i++) {
            /*for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }*/
             o +="*";
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        pyramid(1);
        System.out.println("==========");
        pyramid(3);
        System.out.println("==========");
        pyramid(5);
    }
}
