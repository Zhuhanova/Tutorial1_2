public class Main1{

public static void main(String[] args) {

    int[] arr = {1, 2, 3, 4, 5, 6};
    int[] arr1 = filterEvenIndexOddValue(arr);

    for(int i=0; i<arr1.length; i++){
        if(arr1[i]!=0) System.out.print(arr1[i] + " ");
    }
}
public static int[] filterEvenIndexOddValue(int[] arr){

    int[] arr2 = new int[arr.length];
    for(int i = 0; i<arr.length; i++){
        if(i%2==0&&arr[i]%2!=0)
            arr2[i] = arr[i];
    }
    return arr2;
}
        }