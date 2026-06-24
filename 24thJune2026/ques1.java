import java.util.*;

public class ques1 {

    static String[] keypad = {
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
    };

    static List<String> result = new ArrayList<>();

    static void backtrack(String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = keypad[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {
            current.append(ch);
            backtrack(digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String digits = sc.next();

        if (digits.length() == 0) {
            return;
        }

        backtrack(digits, 0, new StringBuilder());

        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}