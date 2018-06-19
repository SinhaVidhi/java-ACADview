import java.util.Scanner;

class Second_Largest_No {
    public static void main(String[] args) {
        System.out.println("Enter any 3 numbers ");
        Scanner scan = new Scanner(System.in);
        int arr[] = { 0,0,0};
        int i, temp;
        for (i = 0; i < 3 ; i++)
            arr[i] = scan.nextInt();
        int max_index = 0;
        for (i = 0; i < 3; i++) {
            if (arr[i] > arr[max_index])
                max_index = i;
            if (i == 1) {
                temp = arr[max_index];
                arr[max_index] = arr[0];
                arr[0] = temp;
            }
            max_index = 1;
            for (i = 1; i < 3; i++) {
                if (arr[i] > arr[max_index])
                    max_index = i;
            }
            System.out.println(" " + arr[max_index]);
        }
    }
}