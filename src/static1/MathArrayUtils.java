package static1;

public class MathArrayUtils {

    static int sumArray = 0;

    public static int sum(int[] array){
        for(int i =0; i<array.length; i++){
            sumArray +=array[i];
        }
        return sumArray;
    }
    public static double average(int[] array) {
        return sumArray / array.length;
    }

    public static int min(int[] array) {
        int min = 9999;
        for(int i=0; i<array.length; i++){
                if(min>array[i]){
                    min=array[i];
                }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = 0;
        for(int i=0; i<array.length; i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }



}
