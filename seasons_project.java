import java.util.Scanner;
public class seasons_project {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numer from 1 to 12 : ");
        int month = sc.nextInt();

        switch (month) {
            case 10 :
            case 11 :
            case 12 :
            case 1 :
            {
                System.out.println("The given number of month is in Winter ");
                break;
            }
            case 2 :
            case 3 :
            case 4 :
            case 5 :
            {
                System.out.println("The given number of month is in Summer ");
                break ;
            }
            case 6 :
            case 7 :
            case 8 :
            case 9 :
            {
                System.out.println("The given number of month is in Monsoon");             
                break;
            }
            default:
                break;
        }
    }
    
}
