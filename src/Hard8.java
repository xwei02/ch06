public class Hard8 {
    public static int fibonacci(int n){
        if (n==0) return 1;
        if (n==1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
        System.out.println(fibonacci(15));
    }
}
