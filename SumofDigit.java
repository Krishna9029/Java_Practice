import java.util.Scanner;

public class SumofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array " );

        int size = sc.nextInt();

        System.out.println("The size of Array is " + size);

        int[] arr = new int [size];

        System.out.println("Enter the values");

        int sumofdigit =0;
        
        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
            sumofdigit = sumofdigit+ arr[i];
        }
        
        System.out.println("The sum of the digits : " +sumofdigit);


    sc.close();
    }


    
}
