import java.util.Scanner;

class vowels_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char vowel = sc.next().charAt(0);
        System.out.print("The letter is vowel: " + vowel);

        switch (vowel) {
            case 'a':
            case 'A': {
                System.out.print("\n A is vowel");
                break;
            }
            case 'e':
            case 'E': {
                System.out.print("\n E is vowel");
                break;
            }
            case 'i':
            case 'I':
            {
                System.out.print("\n I is vowel");
                break;
            }
            case 'o':
            case 'O':
            {
                System.out.print("\n O is vowel");
                break;
            }
            case 'u':
            case 'U':
            {
                System.out.print("\n U is vowel");
            }

            default:
                break;
        }
    }
}
