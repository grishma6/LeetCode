import java.util.HashSet;
import java.util.Iterator;

public class HashingSet {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //print all the elements
        System.out.println(set);


        //contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if (!set.contains(6)){
            System.out.println("set dosnot contain");
        }

        //size
        System.out.println(set.size());

        //Delete
        //set.remove(1);
        System.out.println(set);

        //Iterator
        //hasNext next
        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
