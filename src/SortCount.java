import java.sql.SQLOutput;
import java.util.Arrays;

public class SortCount {
    public static void main(String[] args) {
        int[] arr = {2, 6, -99, 12, 56, 6, 34, 90, 5, 2, -6, 8, -23};
        System.out.println(Arrays.toString(arr));
        sortCount(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int min (int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min >= arr[i]) min = arr[i];
        }
        return min;
    }

    static int max (int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) max = arr[i];
        }
        return max;
    }

    public static void sortCount(int[] arr) {
        int min = (min(arr) > 0) ? min(arr) : -min(arr);
        int max = max(arr);

        int[] supportArr = new int[max + min + 1];
        for (int i = 0; i < arr.length; i++) {
            supportArr[arr[i] + min]++;
        }

        int count = 0;
        for (int i = 0; i < supportArr.length; i++) {
            if (supportArr[i] != 0) {
                for (int j = 0; j < supportArr[i]; j++) {
                    arr[count] = i - min;
                    count++;
                }
            }
        }
    }
}
