import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        int words = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        String[] arr = str.trim().split("\\s+");
        if (str.trim().length() == 0) {
            words = 0;
        } else {
            words = arr.length;
        }
        System.out.println("Total Vowels: " + vowels);
        System.out.println("Total Consonants: " + consonants);
        System.out.println("Total Words: " + words);
    }
}