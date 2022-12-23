import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print(args [0]);
        System.out.println("Alexey Karpuk! " + args [1]);
        System.out.println(args [2]);
        System.out.println(args [3]);
        Scanner sc = new Scanner(System.in);
        int y = 2022;
        int a = sc.nextInt();
        int x = y - a;
        System.out.print(args [4]);
        System.out.println(x + args [5]);
        System.out.println(args [6]);
        int b = 31;
        int c = sc.nextInt();
        int v = b - c;
        System.out.print(args [7] + v);
        System.out.println(args [8] + args [9]);
    }
}