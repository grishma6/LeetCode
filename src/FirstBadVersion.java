public class FirstBadVersion {
    int firstBad = 4;
    public int firstBadVersion(int n){
        int low = 1;
        int high = n;
        
        while(low<high){
            int middle = low+(high-low)/2;
            
            if(isBadVersion(middle)){
                high = middle;
            }
            else{
                low = middle+1;
            }
        }
        return low;
    }

    private boolean isBadVersion(int version) {
        return version >= firstBad;
    }

    public static void main(String[] args){
        FirstBadVersion fb = new FirstBadVersion();
        System.out.println(fb.firstBadVersion(10));
    }
}
