public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {9,8,5,6,1,2};

        int index = linearSearch(arr, 1);

        if(index != 1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] arr,int value){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}
