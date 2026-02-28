import java.util.Scanner;

public class MoveAllNegativeElementsToEnd {

    public static void moveNegatives(int[] arr) {

        int[] temp = new int[arr.length];
        int index = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0) {
                temp[index++] = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
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

        moveNegatives(arr);

        System.out.println("After rearranging:");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}