import java.util.*;
public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];
        String[] output = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        System.out.print("Search Prefix = ");
        String prefix = sc.nextLine();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (str[i].startsWith(prefix)) {
                output[c] = str[i];
                c++;
            }
        }
        for (int i = 0; i < c - 1; i++) {
            for (int j = i + 1; j < c; j++) {
                if (output[i].compareTo(output[j]) > 0) {
                    String temp = output[i];
                    output[i] = output[j];
                    output[j] = temp;
                }
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.println(output[i]);
        }
    }
}