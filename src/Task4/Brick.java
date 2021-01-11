package Task4;

public class Brick {
    public static void main(String[] args) {
        int A = 40;
        int B = 60;

        int x = 59;
        int y = 59;
        int z = 59;

        boolean side = x <= B && y <= A; // кирпич проходит боком
        boolean front = z <= B && y <= A; //
        boolean up = x <= B && z <= A; //
        boolean suit = side == true && front == true && up == true;

        if (suit) {
            System.out.println("Кирпич проходит в отверстие");
        } else {
            System.out.println("Кирпич не проходит в отверстие");
        }

    }
}
