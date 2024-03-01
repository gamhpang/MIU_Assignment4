public class Problem1 {

    public static void main(String[] args) {
        reverseOrder(1234);
    }

    static void reverseOrder(int n){
        if(n/10==0){
            System.out.print(n);
            return;
        }
        System.out.print(n%10);
        reverseOrder(n/10);
    }
}
