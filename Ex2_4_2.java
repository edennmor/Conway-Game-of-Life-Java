public class Ex2_4_2 {
    public static void main(String args[]) {

        System.out.println(dec2Hex(5678));
//318744265

    }
        //4B
        public static String dec2Hex ( int num){
            String hex = "";
            if (num!=0) {
                while (num > 0) {
                    int dec = num % 16;
                    char hexa = int2Char(dec);
                    hex = hexa + hex;
                    num /= 16;
                }
                return hex;
            }else{
                return new String("0000");
            }
        }


        private static char int2Char ( int num){
            if (num >= 0 && num <= 9) {
                return (char) ('0' + num);
            } else {
                return (char) (55 + num);
            }
        }

    }

