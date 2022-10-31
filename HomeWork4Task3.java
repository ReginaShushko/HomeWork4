import java.util.Scanner;

public class HomeWork4Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter digit:");
        int n = scanner.nextInt();

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("Factorial: " + result);
    }
}

