import java.util.Scanner;

public class Fibonnacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int first = 0;
        int second = 1;
        for (int i = 0; i < num; i++) {
            System.out.println(first);

            int next = first + second;

            first = second;
            second = next;

        }
        sc.close();
    }
}
