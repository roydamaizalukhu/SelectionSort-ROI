import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int nilai_1[] = {30, 20, 15, 45, 70, 5};
        int nilai_2[] = {10, 20, 30, 40, 25, 15, 5};

        goSort(nilai_1, "DESC");
        System.out.println("Sorted nilai_1 (DESC): " + Arrays.toString(nilai_1));

        goSort(nilai_1, "ASC");
        System.out.println("Sorted nilai_1 (ASC): " + Arrays.toString(nilai_1));

        goSort(nilai_2, "ASC");
        System.out.println("Sorted nilai_2 (ASC): " + Arrays.toString(nilai_2));

        goSort(nilai_2, "DESC");
        System.out.println("Sorted nilai_2 (DESC): " + Arrays.toString(nilai_2));
    }

    public static void goSort(int[] data, String option) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (option.equals("ASC")) {
                    if (data[j] < data[minIndex]) {
                        minIndex = j;
                    }
                } else if (option.equals("DESC")) {
                    if (data[j] > data[minIndex]) {
                        minIndex = j;
                    }
                }
            }

            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }
}
