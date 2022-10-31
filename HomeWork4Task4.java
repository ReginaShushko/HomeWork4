public class HomeWork4Task4 {
    public static void main(String[] args) {
        int a, b = 0;
        for (int i = 4; i <= 99999; i++) {
            a = i;
            while (a != 0) {
                if (a % 10 == 4 || a % 100 == 13) {
                    b++;
                    break;
                }
                a = a / 10;
            }
        }
        System.out.print("Excluded numbers: " + b);
    }
}