import java.util.Scanner;

public class StringComparison {


    public static boolean compareStringsCharAt(String s1, String s2) {

        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean charAtResult = compareStringsCharAt(str1, str2);
        boolean equalsResult = str1.equals(str2);

        System.out.println("Comparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsResult);
        if (charAtResult == equalsResult) {
            System.out.println("Both methods yield the same result.");
        } else {
            System.out.println("Methods yield different results.");
        }
       
    }
}
