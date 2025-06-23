import java.util.Scanner;

public class IllegalArgumentDemo {
    
    public static void generateException(String text, int start, int end) {
        
        System.out.println(text.substring(start, end));
    }

    
    public static void handleException(String text, int start, int end) {
        try {
            System.out.println(text.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        // Uncomment to see the exception
        // generateException(text, end, start);
        handleException(text, end, start);
    }
}
