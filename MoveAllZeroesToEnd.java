import java.util.Scanner;

public class MoveAllZeroesToEnd {

    public static void pushZerosToEnd(int[] arr) {

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while(count < arr.length) {
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        pushZerosToEnd(arr);

        System.out.println("After moving zeroes:");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}