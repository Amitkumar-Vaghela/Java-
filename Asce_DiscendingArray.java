//Ascending order
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        System.out.println("List sorted with bubble sort in ascending order: ");
        bubbleSort(arr);
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        int arr_len = arr.length;
        for (int i = 0; i < arr_len - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr_len - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Discending order
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        System.out.println("List sorted with bubble sort in descending order: ");
        bubbleSortDescending(arr);
        printArray(arr);
    }

    public static void bubbleSortDescending(int[] arr) {
        int arr_len = arr.length;
        for (int i = 0; i < arr_len - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr_len - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

