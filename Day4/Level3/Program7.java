import java.util.Scanner;
public class OTPGenerator{
    public static int[] generate_otp(){
        int[] array = new int[10];
        int max = 999999;
        int min = 100000;
        for(int i = 0 ; i < 10 ; i++){
            int rand = (int) (Math.random() * (max - min + 1)) + min;
            array[i] = rand;
        }
        return array;
    }

    public static boolean unique(int[] array){
        boolean isunique = true;
        for(int i = 0; i < 10 ; i++){
            for(int j = (i + 1); j < 10 ; j++){
                if (array[i] == array[j]){
                    isunique = false;
                }
            }
        }
        return isunique;
    }

    public static void main(String[] args){
        int[] otp = generate_otp();

        boolean unique_otp = unique(otp);
        if (unique_otp){
            System.out.print("The generated OTP is unique");
        }
        else{
            System.out.print("The generated OTP is not unique");
        }
    }
}