import java.util.Scanner;

public class CountVowelsandConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = sc.nextLine();

        int vowelCount =0;
        int consonantCount =0;

        for(int i =0; i<str.length();i++){
            
            char ch = Character.toLowerCase(str.charAt(i));

            if(ch =='a'||ch =='e'||ch =='i'||ch =='0'||ch =='u'){
                    vowelCount++;

            }else{
                consonantCount++;
            }
            
        }
System.out.println("The given string contains "+ vowelCount +" vowels "+ " and "+consonantCount+" consonants." );


        sc.close();
    }
}
