import java.util.Scanner;
public class CountOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = input.nextInt();
        System.out.println("Enter the number to be detected : ");
        int numbertobeDetected = input.nextInt();
        int count = 0;
        int i = 0;
        while(number!=0) {
            number = number/10;
            count++;
//            while(i < count ) {
//                if(charAt(i) == numbertobeDetected) {
//                    i++;
//                    System.out.println(i);
//                }
//                else {
//                    sout("number not present ");
//                }
//            }
        }
        System.out.println("The length of the number is : " + count);



    }
}
