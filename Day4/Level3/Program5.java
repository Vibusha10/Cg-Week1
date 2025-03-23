import java.util.Scanner;
public class NumberChecker
{
    public static void prime(int number){
        boolean isprime = true;
        for (int i = 2 ; i < (number/2) + 1 ; i++){
            if (number % i == 0){
                isprime = false;
            }
        }
        if (isprime){
            System.out.println(number + " is a prime number");
        }
        else{
            System.out.println(number + " is a not prime number");
        }
    }

    public static void neon_number(int number){
        int square = (int) Math.pow(number,2);
        int sum = 0;
        int temp = number;
        while (temp !=0){
            sum += (temp % 10);
            temp /= 10;
        }
        if(sum == number){
            System.out.println(number + " is a neon number");
        }
        else{
            System.out.println(number + " is not a neon number");
        }
    }

    public static void spy_number(int number){
        int sum = 0;
        int prod = 1;
        int temp = number;
        while (temp !=0){
            sum += (temp % 10);
            prod *= (temp % 10);
            temp /= 10;
        }
        if(sum == prod){
            System.out.println(number + " is a spy number");
        }
        else{
            System.out.println(number + " is not a spy number");
        }
    }

    public static void automorphic_number(int number){
        int square = (int) Math.pow(number,2);
        int temp = number;
        int count = 0;
        while (temp !=0){
            temp /= 10;
            count += 1;
        }
        int auto = square % (int) Math.pow(10,count);
        if (number == auto ){
            System.out.println(number + " is an automorphic number");
        }
        else{
            System.out.println(number + " is an not automorphic number");
        }
    }

    public static void buzz_number(int number){
        if (number % 7 == 0 ){
            System.out.println(number + " is a buss number");
        }
        else if (number % 10 == 7){
            System.out.println(number + " is a buss number");
        }
        else{
            System.out.println(number + " is not a buss number");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        prime(number);
        
        neon_number(number);

        spy_number(number);

        automorphic_number(number);

        buzz_number(number);
    }
}