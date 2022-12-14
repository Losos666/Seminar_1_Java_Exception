import java.util.ArrayList;
import java.util.Arrays;


public class DZ_Task_1 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {0, 1, 2, 3, 3, 2, 1, 2, 3};
        System.out.println("Array_1 " + Arrays.toString(array1));
        System.out.println("Array_2 " + Arrays.toString(array2));
        System.out.println("Difference of two arrays " + differenceArray(array1, array2));
        System.out.println("Quotient of two arrays " + divideArray(array1, array2));
    }

    public static ArrayList<Integer> differenceArray(int[] a1, int[] a2) {
        ArrayList<Integer> res = new ArrayList<>();
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);
        if (min < 1) {
            throw new RuntimeException("One of the arrays is empty");
        }
        if (min < max) {
            throw new RuntimeException("The lengths of the arrays are not equal!");
        }
        for (int i = 0; i < min; i++) {
            res.add(a1[i] - a2[i]);
        }
        return res;
    }

    public static ArrayList<Float> divideArray(int[] a1, int[] a2) {
        ArrayList<Float> res = new ArrayList<>();
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);
        if (min < 1) {
            throw new RuntimeException("one of the arrays is empty");
        }
        if (min < max) {
            throw new RuntimeException("The lengths of the arrays are not equal!");
        }
        for (int i = 0; i < min; i++) {
            if (a2[i] != 0) {
                res.add((float) (a1[i] / a2[i]));
            } else {
                throw new RuntimeException("Division by zero");
            }
        }
        return res;
    }
}