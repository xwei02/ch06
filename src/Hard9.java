import java.util.Scanner;

public class Hard9 {
    public static int gcd(int a, int b){
        while (b!=0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public static int lcm(int a, int b){
        return (a+b)/gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("int 1: ");
        int int1 = scanner.nextInt();
        System.out.println("int 2: ");
        int int2 = scanner.nextInt();

        System.out.println("GCD = "+gcd(int1, int2));
        System.out.println("LCM = "+lcm(int1, int2));
    }
}
