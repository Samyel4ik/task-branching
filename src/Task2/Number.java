package Task2;

public class Number {
    public static void main(String[] args) {
        // Найти max{min(a, b), min(c, d)}.
        int a = 4;
        int b = 3;
        int c = 2;
        int x = 1;
        int min1;
        int min2;
        int max;

        if (a > b) {
            min1 = b;
        } else {
            min1 = a;
        }

        if (c > x) {
            min2 = x;
        } else {
            min2 = c;
        }

        if (min1 > min2) {
            max = min1;
            System.out.println(max);
        } else {
            max = min2;
            System.out.println(min2);
        }

    }
}

