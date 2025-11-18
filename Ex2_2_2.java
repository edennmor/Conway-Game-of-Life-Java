import java.util.Arrays;

public class Ex2_2_2 {
    public static void main(String args[]){
//318744265

System.out.println(Arrays.toString(perfectNumbers(1000)));

    }


    public static int[] perfectNumbers(int p){
        int size = numOfPerfect(p);
        int[] perfectArray = new int[size];
        int index = 0;
        for(int i=1 ; i<=p ; i++) {
            if(Ex2_2_1.isPerfect(i)) {
                perfectArray[index++] = i;
            }
        }
        return perfectArray;
    }

    public static int numOfPerfect(int n) {
        int counter = 0;
        for(int i=1 ; i<=n ; i++) {
            if(Ex2_2_1.isPerfect(i)) {
                counter++;
            }
        }
        return counter;
    }
}
