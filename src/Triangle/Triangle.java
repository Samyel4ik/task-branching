package Triangle;

public class Triangle {
    public static void main(String[] args) {
        int x = 500;
        int y = 90;
        int i = 180 - x - y;

        if (i > 0 && i < 180) {   //
            System.out.println("такой треугольник есть ");
        }else {
            System.out.println("такого треугольника нет");
        }
        while (x==90 || y==90|| i == 90){
            System.out.println("он прямоугольный");
            break;
        }
    }
}
