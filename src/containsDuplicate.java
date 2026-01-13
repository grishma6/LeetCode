import java.util.HashSet;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int c : nums){
            if(set.contains(c)){
                return true;//duplicates found
            }
            set.add(c); //to store if it is seen
        }
        return false; //no duplicates
    }
}
