package Task2;

public class Number {
    public static void main(String[] args) {
        // Найти max{min(a, b), min(c, d)}.
        int a = 4;
        int b = 3;
        int c = 2;
        int x = 1;
        int max1;
        int max2;
        int max;

        if (a > b) {
            max1 = a;
        } else {
            max1 = b;
        }

        if (c > x) {
            max2 = c;
        } else {
            max2 = x;
        }

        if (max1 > max2) {
            max = max1;
            System.out.println(max);
        } else {
            max = max2;
            System.out.println(max2);
        }

    }
}

