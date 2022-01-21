package BitWiseOperation;

public class FindSingle {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, 2, 3, 8, 4};
        System.out.println(ans(arr));
    }

    public static int ans (int[] arr){
        int single = 0;
        for (int i : arr) {
            single ^= i;
        }
        return single;
    }
}
