public class Main3 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] result = rotateArray(arr, 2);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] rotateArray(int[] arr, int shift) {

        int[] arr2 = new int[arr.length];
        int index = 0;

        for (int i = arr.length-shift; i < arr.length; i++) {
            arr2[index] = arr[i];
            index++;
        }

        for (int i = 0; i < arr.length-shift; i++) {
            arr2[index] = arr[i];
            index++;
        }
        return arr2;
    }
}
