package Java10Loops;
/*
In the loop, when the value is "4", jump directly to the next value.
 */

public class Exercicio06 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if( i == 4){
              continue;
            }
            System.out.println(i);
        }

    }
}
