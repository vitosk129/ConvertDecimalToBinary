import java.util.Scanner;

public class ConvertDecimalToBinary {
    public static void main(String args[]){
        int decNum, remainder, temp, i = 1;
        int binNum[] = new int[100];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Decimal Number: ");
        decNum = scanner.nextInt();

        temp = decNum;

        while (temp != 0) {
            binNum [i++] = temp % 2;
            temp = temp / 2;
        }

        System.out.print("Binary Number: ");
        for (int j = i - 1; j > 0; j--) {
            System.out.print(binNum[j]);
        }
        System.out.print("\n");
    }
}
