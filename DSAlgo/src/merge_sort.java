import java.lang.reflect.Array;
import java.util.Arrays;

public class merge_sort {
    int[] merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = 0;
        while (i < n1 && j<n2) {
            
        }
        return arr;
    }

}
