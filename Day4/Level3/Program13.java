import java.util.Scanner;
public class Program13
{
    public static int[][] matrix_creation(int row,int column){
        int[][] matrix = new int[row][column];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                matrix[i][j] =  (int) (Math.random() * 90) + 10;
            }
        }
        return matrix;
    }

    public static int[][] matrix_addition(int row,int column,int[][] matrix1,int[][] matrix2){
        int[][] add = new int[row][column];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                add[i][j] =  matrix1[i][j] + matrix2[i][j];
            }
        }
        return add;
    }

    public static int[][] matrix_subtraction(int row,int column,int[][] matrix1,int[][] matrix2){
        int[][] sub = new int[row][column];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                sub[i][j] =  matrix1[i][j] - matrix2[i][j];
            }
        }
        return sub;
    }

    public static int[][] matrix_multiplication(int row,int column,int[][] matrix1,int[][] matrix2){
        int[][] mul = new int[row][column];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                mul[i][j]  = 0;
                for(int k = 0 ; k < row ; k++){
                    mul[i][j] =  matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return mul;
    }

     public static int[][] matrix_transpose(int row,int column,int[][] matrix1){
        int[][] trans = new int[row][column];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                trans[i][j] = matrix1[j][i];
            }
        }
        return trans;
    }

    public static int matrix_determinant2(int[][] matrix){    
        int det = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        return det;
     }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows : ");
        int rows = input.nextInt();

        System.out.print("Enter the number of coumn : ");
        int column = input.nextInt();

        System.out.println("\nMatrix1 : ");

        int[][] matrix1 = matrix_creation(rows,column);
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < column ; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        int[][] matrix2 = matrix_creation(rows,column);
        
        int[][] add = matrix_addition(rows,column,matrix1,matrix2);

        int[][] sub = matrix_subtraction(rows,column,matrix1,matrix2);       
       
        System.out.println("\nMatrix Multiplication : ");

        int[][] mul = matrix_multiplication(rows,column,matrix1,matrix2);       
        
        int[][] trans = matrix_transpose(rows,column,matrix1);   
        
        int[][] matrix3 = matrix_creation(2,2);
        int det2 = matrix_determinant2(matrix3);

        int[][] matrix4 = matrix_creation(3,3);
        int det3 = matrix_determinant2(matrix4);

     }
}