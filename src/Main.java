import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print(args [0]);
        System.out.println("Alexey Karpuk! " + args [1]);
        Scanner sc = new Scanner(System.in);
        int y = 2022;
        int a = sc.nextInt();
        int x = y - a;
        System.out.print(args [2]);
        System.out.println(x + args [3]);
        System.out.println(args [4]);
        int b = 31;
        int c = sc.nextInt();
        int v = b - c;
        System.out.print(args [5] + v);
        System.out.println(args [6] + args [7]);
    }
}