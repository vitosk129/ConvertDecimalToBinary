import java.util.Scanner;

public class ConvertDecimalToBinary {
    public static void main(String args[]){
        int decimalNumber, remainder, temp, i = 1;
        int binaryNumber[] = new int[100];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Decimal Number: ");
        decimalNumber = scanner.nextInt();

        temp = decimalNumber;

        while (temp != 0) {
            binaryNumber [i++] = temp % 2;
            temp = temp / 2;
        }

        System.out.print("Binary Number: ");
        for (int j = i - 1; j > 0; j--) {
            System.out.print(binaryNumber[j]);
        }
        System.out.print("\n");
    }
}
