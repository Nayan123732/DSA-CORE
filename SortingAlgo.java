import java.util.Arrays;
import java.util.Scanner;

class Main {
    static void bubsort(int[] arr1) {
        int n = arr1.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp;
                    temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        System.out.println("Updated array for bubble sort: " + Arrays.toString(arr1));
    }

    static void selsort(int[] arr2) {
        int m = arr2.length;
        for (int i = 0; i < m - 1; i++) {
            int mindex = i;
            for (int j = i + 1; j < m; j++) {
                if (arr2[j] < arr2[mindex]) {
                    mindex = j;
                }
            }
            int temp = arr2[mindex];
            arr2[mindex] = arr2[i];
            arr2[i] = temp;
        }
        System.out.println("Updated selection sort algorithm is given: " + Arrays.toString(arr2));
    }

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        System.out.print("Enter the number of elements to store in array: ");
        int b = a.nextInt();
        
        int[] userArray = new int[b];
      
        System.out.println("Enter " + b + " elements:");
        for (int i = 0; i < b; i++) {
            userArray[i] = a.nextInt();
        }
        
        int[] arrayForSelSort = userArray.clone();

        bubsort(userArray);
        selsort(arrayForSelSort);
        
        a.close();
    }
}
