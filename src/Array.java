import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        //int[] marks = new int[3];
        //int marks[] = new int[3];// any syntax works above or this declaration is the same

        int marks[] = {95,96,97};

        //marks[0] = 95;
        //marks[1] = 96;
        //marks[2] = 97;
        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);

        //for(int i=0; i<3; i++){
        //    System.out.println(marks[i]);
        //}

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the size of an array: ");
        int size = scanner.nextInt();
        int numbers[] = new int[size];

        //Input
        for(int i=0; i<size; i++){
            numbers[i]=scanner.nextInt();
        }

        //Output
        for(int i=0; i<size; i++){
            System.out.println(numbers[i]);
        }
    }

    public static class TwoDArray {
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
}
