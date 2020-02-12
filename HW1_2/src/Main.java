import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int c = sc.nextInt();
        int v = sc.nextInt();
        sc.close();
        System.out.println("__________________________");

        int [] arr = {x,y,z,c,v};
        /*for (int i = 0; i<arr.length; i++){
            System.out.println("input next number, please");
            arr[i] = sc.nextInt();
        }*/

        //sc.close();

        boolean isSorted = false;
        while (!isSorted ){
            isSorted = true;
            for (int j = 1; j<arr.length; j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSorted = false;
                }

            }
        }
        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
