package Task4;

public class Brick {
    public static void main(String[] args) {
        int A = 10;
        int B = 15;
        int x = 10;
        int y = 19;
        int z = 1;

        boolean боком = x <= B || y <= A;
        boolean передом = z <= B || y <= A;
        boolean верхом = x <= B || z <= A;

        if (боком && передом && верхом) {
            System.out.println("проходит");
        } else {
            System.out.println("не проходит");
        }
    }
}
