package Task4;

public class Brick {
    public static void main(String[] args) {
        int A = 60;
        int B = 40;
        int x = 59;
        int y = 59;
        int z = 59;

        boolean боком = x <= B || y <= A; // кирпич проходит боком
        boolean передом = z <= B || y <= A; //
        boolean верхом = x <= B || z <= A; //

        if (боком && передом && верхом) {
            System.out.println("проходит");
        } else {
            System.out.println("не проходит");
        }
    }
}
