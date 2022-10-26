public class Practice6 {
    public static int findMax(int[] inputs){
        int maxNum = inputs[0];
        for (int i = 1; i < inputs.length; i++) {
            if (inputs[i]>inputs[i-1]){
                maxNum = inputs[i] ;
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] array = {4, 3, 6, 7, 9, 0, -4};
        System.out.println(findMax(array));
    }

}
