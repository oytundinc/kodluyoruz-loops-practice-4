import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number1;
        int number2;
        int total1 = 1;
        int total2 = 1;
        int total3 = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç elemanlı bir küme mevcut : ");
        number1 = input.nextInt();

        System.out.print("Kaç elemanlı bir küme istiyorsunuz : ");
        number2 = input.nextInt();

        for (int i = 2; i <= number1; i++) {
                total1 = total1 * i;
        }

        for (int i = 2; i <= number2; i++) {
            total2 = total2 * i;
        }

        for (int i = 2; i <= (number1 - number2); i++) {
            total2 = total2 * i;
        }

        int combination = total1 / (total2 * total3);

        System.out.println(combination);

    }
}
