package Task4;

public class Brick {
    public static void main(String[] args) {
        int A = 40;
        int B = 60;

        int x = 59;
        int y = 59;
        int z = 59;

        boolean side = x <= B && y <= A; // кирпич проходит боком
        boolean front = z <= B && y <= A; // передом
        boolean up = x <= B && z <= A; //верхом
        boolean expand = x <= A && y <= B; // 1 доп условие если перевернуть


        if (side == true) {
            System.out.println("Кирпич проходит в отверстие боком");
        } else {
            System.out.println("Кирпич не проходит в отверстие боком");
        }
        if (front == true) {
            System.out.println("Кирпич проходит в отверстие передом");
        } else {
            System.out.println("Кирпич не проходит в отверстие передом");
        }
        if (up == true) {
            System.out.println("Кирпич проходит в отверстие верхом");
        } else {
            System.out.println("Кирпич не проходит в отверстие верхом");
        }
        if (expand == true) {
            System.out.println("Кирпич проходит в отверстие боком если его перевернуть");
        } else {
            System.out.println("Кирпич не проходит в отверстие боком если его перевернуть");
        }
    }
}
