public class larger {
    public static void main (String [] args){
        int num1 = 20;
        int num2 = 40;
        int num3 = 60;

        if (num1 > num2 && num1 > num3){
            System.out.println("the first number is larger : "+ num1);
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("the second number is larger : "+ num2);
        }
        else{
            System.out.println("the third number is larger : "+ num3);
        }
    }
    
}
