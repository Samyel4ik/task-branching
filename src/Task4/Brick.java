package Task4;

public class Brick {
    public static void main(String[] args) {
        int A = 40;
        int B = 60;

        int x = 120;
        int y = 59;
        int z = 39;

        boolean side = x <= B && y <= A; // кирпич проходит боком
        boolean front = z <= B && y <= A; // передом
        boolean up = x <= B && z <= A; //верхом
        boolean expand = x <= A && y <= B; // 1 доп условие если перевернуть
        boolean передомПеревернуть = y <= B && z <= A;
        boolean верхомПеревернуть = x <= A && z <= B;


        if (side) {
            System.out.println("Кирпич проходит в отверстие боком");
        } else {
            System.out.println("Кирпич не проходит в отверстие боком");
        }
        if (front) {
            System.out.println("Кирпич проходит в отверстие передом");
        } else {
            System.out.println("Кирпич не проходит в отверстие передом");
        }
        if (up) {
            System.out.println("Кирпич проходит в отверстие верхом");
        } else {
            System.out.println("Кирпич не проходит в отверстие верхом");
        }
        if (expand) {
            System.out.println("Кирпич проходит в отверстие боком если его перевернуть");
        } else {
            System.out.println("Кирпич не проходит в отверстие боком если его перевернуть");
        }
        if (передомПеревернуть) {
            System.out.println("Кирпич проходит в отверстие передом если его перевернуть");
        } else {
            System.out.println("Кирпич не проходит в отверстие передом если его перевернуть");
        }
        if (верхомПеревернуть) {
            System.out.println("Кирпич проходит в отверстие верхом если его перевернуть");
        } else {
            System.out.println("Кирпич не проходит в отверстие верхом если его перевернуть");
        }
    }
}
