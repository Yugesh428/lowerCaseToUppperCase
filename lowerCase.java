import java.util.Scanner;

public class lowerCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        String lower = text.toUpperCase();

        System.out.println("Lowercase text: " + lower);

        sc.close();
    }
}
