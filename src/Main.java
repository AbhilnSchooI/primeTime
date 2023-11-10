import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("input a number");
        int num = scan.nextInt();
        boolean prime = true;

        for(int i = 2; i <= num / 2; i++){
            if(num % i == 0){
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println("your number is prime");
        }else{
            System.out.println("your number is not prime");
        }
    }
}