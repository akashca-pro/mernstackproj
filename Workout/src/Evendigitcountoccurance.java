import java.util.Scanner;

public class Evendigitcountoccurance {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count =0;

        System.out.println("Enter the size of the array");
        int size = in.nextInt();

        int[] arr =new int[size];

        for (int row = 0; row < arr.length; row++) {
            System.out.println("Enter the number ");
            arr[row]=in.nextInt();
        }

        for (int num: arr)
        {
            if(even(num))
                count++;
        }
        System.out.println("Even occurrence of digit is "+count);
    }

    static boolean even(int num) {
        int count=0;
        while(num>0)
        {
            count++;
            num/=10;
        }
        return count%2==0;
    }
}
