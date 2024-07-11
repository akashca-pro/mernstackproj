import java.util.Arrays;
import java.util.Scanner;

public class Max {
// Linear Searching in 2d array
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int[][] arr = {
                {1, 3, 54, 8},
                {5, 94},
                {1, 2, 4}
        };

        System.out.println("Enter the target to search");
        int target=in.nextInt();

        System.out.println(Arrays.toString(search(arr,target)));

        System.out.println(max(arr));
    }
    static int[] search(int[][] arr ,int target)
    {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]== target)
                    return new int[]{row,col};
            }
        }
        return new int [] {-1};
    }

    // finding the max value in the 2d array

    static int max(int [][] arr)
    {
        int max=Integer.MIN_VALUE;

        for (int[] ints : arr) {
            for (int element : ints) {
                if (max < element) {
                    max = element;
                }
            }
        }
        return max;
    }
}




