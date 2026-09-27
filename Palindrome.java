import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String  reversed = "";

        for(int i= str.length()-1;i>=0;i--){
            reversed = reversed + str.charAt(i);

}
        if(reversed.equalsIgnoreCase(str)){
            System.out.println("The given value is Palindrome");
        }else{
            System.out.println("The given value is not a Palindrome");

        }        
        sc.close();

    }
    
}
