public class Problem3 {
    public static void main(String[] args) {
        int[] n = {1,2,3};
        System.out.println(computeSum(n));
    }

    public static int computeSum(int[] n){
       if(n.length == 1){
           return n[0];
       }

       int[] a = new int[n.length-1];
       System.arraycopy(n,1,a,0,a.length);
       return n[0]+computeSum(a);

    }
}
