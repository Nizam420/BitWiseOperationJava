package BitWiseOperation;

public class PowOfTwo {
    public static void main(String[] args) {
        int n = 16; // n = 0 false
        boolean ans = (n & (n - 1)) == 0;
        System.out.println(ans);
    }
}
