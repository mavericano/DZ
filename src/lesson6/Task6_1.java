package lesson6;

public class Task6_1 {
    public static void main(String[] args) {
        int arr[] = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print("Element №" + (i + 1) + " is " + arr[i] + " ");
        }

        System.out.println(" ");
        int j = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            j--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element №" + (i + 1) + " is " + arr[i] + " ");
        }
    }
}
