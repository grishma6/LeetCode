import java.util.HashMap;

public class HappyNumber {
    public boolean ishappy(int n){

        HashMap<Integer, Boolean> map = new HashMap<>();

        while(n != 1){
            if(map.containsKey(n)) return false;

            map.put(n,true);
            int sum = 0;

            while(n > 0){
                int digits = n%10;
                sum += digits*digits;
                n=n/10;
            }
            n = sum;
        }
        return true;
    }
}
