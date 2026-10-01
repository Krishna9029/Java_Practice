import java.util.Scanner;

public class CountEvenandOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("The Even count is " + evenCount);
        System.out.println("The odd count is " + oddCount);
        sc.close();
    }
}
