import java.util.*;

public class TwoDArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int numbers[][] = new int[rows][cols];

        //input
        //rows
        for(int i=0; i<rows; i++){
            //cols
            for(int j=0; j<cols; j++){
                numbers[i][j] = scanner.nextInt();
            }
        }

        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(


            );
        }
    }
}
