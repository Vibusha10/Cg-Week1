import java.util.Scanner;
public class NumberChecker
{
    public static int[] factor(int number){
        int count = 0;
        for(int i = 1; i < number ; i++){
            if(number % i == 0){
                count += 1;
            }
        }
        int[] array = new int[count];
        int index = 0;
        for(int i = 1; i < number ; i++){
            if(number % i == 0){
                array[index] = i;
                index++;
            }
        }
        return array;
    }

    public static int greatest_factor(int[] array){
        int max = array[0];
        for(int i : array){
            max = Math.max(max,i);
        }
        return max;        
    }

    public static int sum_factor(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum;        
    }

    public static int product_factor(int[] array){
        int product = 1;
        for(int i : array){
            product *= i;
        }
        return product;        
    }

    public static long product_cube_factor(int[] array){
        long product = 1;
        for(int i : array){
            product *= (int) Math.pow(i,3);
        }
        return product;        
    }

    public static void perfect_number(int[] array,int number){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        if (sum == number){
            System.out.println(number + " is a perfect number");
        }
        else{
            System.out.println(number + " is not a perfect number");
        }        
    }

    public static void abundant_number(int[] array,int number){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        if (sum > number){
            System.out.println(number + " is a abundant number");
        }
        else{
            System.out.println(number + " is not a abundant number");
        }        
    }

    public static void deficient_number(int[] array,int number){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        if (sum < number){
            System.out.println(number + " is a deficient number");
        }
        else{
            System.out.println(number + " is not a deficient number");
        }        
    }

     public static void strong_number(int number){
        int sum = 0;
        int temp = number;
        while(temp != 0){
            int fact = 1;
            int digit = temp % 10;
            for(int i =1 ; i <= digit ; i++){
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if (sum == number){
            System.out.println(number + " is a strong number");
        }
        else{
            System.out.println(number + " is not a strong number");
        }        
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = input.nextInt();

        System.out.println("The factors are ");
        int[] array =  factor(number);
        for(int i = 0 ; i < array.length ; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println("\nThe greatest factor is " + greatest_factor(array));
        System.out.println("The sum of factors is " + sum_factor(array));
        System.out.println("The product of factors is " + product_factor(array));
        System.out.println("The product of cube of factors is " + product_cube_factor(array));
        perfect_number(array,number);
        abundant_number(array,number);
        deficient_number(array,number);
        strong_number(number);
    }

}