import java.util.Scanner;
import java.util.Arrays;
public class cummulativesum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,arr[];
        a=sc.nextInt();  
        arr=new int[a];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }

        System.out.println("Cumulative Sum: " + Arrays.toString(arr));
    }
}

