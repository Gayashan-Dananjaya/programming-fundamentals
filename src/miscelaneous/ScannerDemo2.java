package miscelaneous;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[5];

        System.out.printf("Enter your marks (split by comma} : ");
        scanner.useDelimiter (",");

        arr[0] = Integer.parseInt(scanner.next());
        arr[1] = Integer.parseInt(scanner.next());
        arr[2] = Integer.parseInt(scanner.next());
        arr[3] = Integer.parseInt(scanner.next());
//        scanner.useDelimiter("")
        arr[4] = Integer.parseInt((scanner.nextLine()).substring(1));

        int total = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        double avg = (double) total / (double) 5;

        System.out.printf("Your total\t\t: %s\n", total);
        System.out.printf("Your average \t\t: %s", avg);

    }
}
