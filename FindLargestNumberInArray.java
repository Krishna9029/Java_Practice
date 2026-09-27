import java.util.Scanner;

public class FindLargestNumberInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        System.out.println("The Largest number in given array is " + max +".");
        sc.close();
    }
    
}
