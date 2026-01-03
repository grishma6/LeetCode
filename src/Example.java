import java.util.Scanner;

public class Example {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the size of an array: ");
        int size = scanner.nextInt();
        int numbers[] = new int[size];


        System.out.print("What is x: ");
        int x = scanner.nextInt();

        //input
        for(int i=0; i<size; i++){
            numbers[i] = scanner.nextInt();
        }

        //output
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("Found the Array at index " + i);
            }
        }
    }
}
