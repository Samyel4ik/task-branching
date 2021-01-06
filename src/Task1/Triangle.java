package Task1;

public class Triangle {
    public static void main(String[] args) {
        int x = 1;
        int y = 500;
        int i = 180 - x - y;

        if (i > 0) {
            System.out.println("такой треугольник есть ");

            if (x == 90 || y == 90 || i == 90) {
                System.out.println("он прямоугольный");
            }
        } else {
            System.out.println("такого треугольника нет");
        }
    }
}
