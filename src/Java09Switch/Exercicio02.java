package Java09Switch;
/*
Complete the switch statement, and add the correct keyword at the end to specify some code to run if there is no
 case match in the switch statement.
 */


public class Exercicio02 {
    public static void main(String[] args) {
        int day = 4;
        switch (day){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Weekend");
        }
    }
}
