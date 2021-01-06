package Task5;

public class Function {
    public static void main(String[] args) {
        double x = 4;
        int a = 3;
        int b = 2;

        if (x <= 3) {
            x = Math.pow(x, b) - 3 * x + 9;
            System.out.println(x);
        } else if (x > 3) {
            x = 1 / (Math.pow(x, a) + 6);
            System.out.println(x);
        }
    }
}