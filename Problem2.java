public class Problem2 {
    public static void main(String[] args) {
        System.out.println(countNumberOfDigits(1234));
    }

    public static int countNumberOfDigits(int n){
        if(n<10){
            return 1;
        }
        return 1+countNumberOfDigits(n/10);

    }
}
