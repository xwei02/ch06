public class Practice10 {
    public static int findLess(int[] inputs, int n ){
        int count = 0;
        for (int i : inputs) {
            if (i<n){
                count++;
             }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(findLess(new int[]{1, 2, 3}, 2));
        System.out.println(findLess(new int[]{1, 2, 3, 4}, 3));
        System.out.println(findLess(new int[]{1, 2, 3, 4, 5}, 0));
    }

}
