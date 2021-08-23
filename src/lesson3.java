import java.util.Arrays;

public class lesson3 {
    //Задание1
    public static void main(String[] args) {

        int[] arr = new int[]{1, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));

//Задание2
        int[] arr1 = new int[100];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (i + 1);
        }
        System.out.println(Arrays.toString(arr1));
//Задание3
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > 6) {
                arr2[i] = 2 * arr2[i];
            }
        }
        System.out.println(Arrays.toString(arr2));

//Задание4
        int[][] arr4 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++);
            {
                arr4[i][arr4[i].length - 1 - i] = 1;
            }
            System.out.println(Arrays.toString(arr4[i]));
        }
        System.out.println(Arrays.toString(arr5(7, 7)));
    }
    //Задание5
    public static int[] arr5(int initialValue, int len)
    {
        int[] result = new int[len];
        for (int i = 0; i < result.length; i++)
        {
            result[i] = initialValue;
        }
        return result;
    }
}













