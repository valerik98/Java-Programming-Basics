package ConditionalStatementLab;

import java.util.Scanner;

public class P02GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Да се напише програма, която чете две цели числа,
        // въведени от потребителя и отпечатва по-голямото от двете.

        int number1 = Integer.parseInt (scanner.nextLine());
        int number2 = Integer.parseInt (scanner.nextLine());
        if (number1>number2){
            System.out.println(number1);
        } else {
            System.out.println(number2);
        }
    }
}
