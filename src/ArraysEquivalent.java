public class ArraysEquivalent {
    public boolean arraysEquivalent(String[] s, String[] t){
        String s1 = String.join("",s);
        String s2 = String.join("",t);

        return s1.equals(s2);
    }
}
