import java.util.*;

public class Example1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int numbers[][] = new int[rows][cols];

        int x = scanner.nextInt();

        //input
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = scanner.nextInt();
            }
        }

        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(numbers[i][j] == x){
                    System.out.println("x fount at (" + i + "," + j +")");
                }
            }
            System.out.println();
        }
    }
}
