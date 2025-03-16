public class Main2 {
    public static void main(String[] args) {
        
        int[] arr = {3, 3, 3, 2, 2};
        System.out.println(findDominant(arr));
    }

    public static int findDominant(int[] arr){

        int count = 0;
        int num = -1;
        int half;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]) count++;
            }

            if(arr.length%2==0){
                half = arr.length/2;
            }else{
                half = arr.length/2+1;
            }

            if(count>= half){
                num = arr[i];
                return num;
            }else{
                count=0;
            }
        }
        return num;
    }
}
