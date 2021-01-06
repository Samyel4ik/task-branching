package Task3;

public class Dot {
    public static void main(String[] args) {
        //Даны три точки А (х1, у1), В (х2, у2) и С (х3, у3).
        // Определить, будут ли они расположены на одной прямой.
        int x1 = 4;
        int x2 = 60;
        int x3 = 4;
        int y1 = 20;
        int y2 = 5;
        int y3 = 6;
        //int ABC =(x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);
        //if(ABC == 0);
        if ((x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1) == 0) {
            System.out.println("Лежат на одной прямой");
        } else {
            System.out.println("Не лежат на одной прямой");
        }
    }
}
