import java.util.Scanner;

public class largest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " Numbers : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int num : arr){
            if(num>max){
                max = num;
            }
        }
        
        System.out.println("The largest number is : "+ max);
    }
}
