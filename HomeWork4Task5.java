public class HomeWork4Task5 {
    public static void main(String[] args) {
        int x = 0;
        for (int hr = 0; hr < 24; hr++) {
            for (int min = 0; min < 60; min++) {
                if (hr % 10 == min / 10 && hr / 10 == min % 10) {
                    x++;
                }
            }
            System.out.println("Symmetry of combinations: " + x);
        }
    }
}