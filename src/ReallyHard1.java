import java.util.Random;

public class ReallyHard1 {
    public static int[] shuffle(int[] arr) {
        int currentIndex = arr.length-1;
        while (currentIndex >0){
            Random random = new Random();
            int i = random.nextInt(currentIndex+1);
            int temp = arr[currentIndex];
            arr[currentIndex] = arr[i];
            arr[i] = temp;
            currentIndex--;
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] array = {5, 2, 34, 4, 6, 77, 12, 45, 15};
        shuffle(array);
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("=======================");
        shuffle(array);
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println();
        System.out.println("=======================");
        shuffle(array);
        for (int i : array) {
            System.out.println(i + " ");
        }

    }
}

