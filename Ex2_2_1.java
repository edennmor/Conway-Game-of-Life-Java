public class Ex2_2_1 {
//318744265

public static void main(String args[]){
    System.out.println(isPerfect(8));

System.out.println(isPerfect(0));
    System.out.println(isPerfect(28));

}


    public static boolean isPerfect(int n) {
        if (n != 0) {
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum == n;
        }
        else{
            return false;
        }
        }

}