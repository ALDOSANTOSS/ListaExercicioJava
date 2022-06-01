package Java08IfElse;
/*
Imprima "1" se xfor igual a y, imprima "2" se xfor maior que y,
caso contrário imprima "3".
 */

public class Exercicio04 {
    public static void main(String[] args) {
        int x = 50;
        int y = 50;
        if (x == y) {
            System.out.println("1");
        } else if (x > y) {
            System.out.println("2");

        } else {
            System.out.println("3");
        }
    }
}
