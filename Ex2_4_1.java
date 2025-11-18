public class Ex2_4_1 {
public static void main(String args[]){
//318744265

}


    public static int hex2Dec(String hex) {
        int dec = 0;
        for(int i=0 ; i<hex.length() ; i++) {
            char current = hex.charAt(i);
            int decimal = char2Int(current);
            if(decimal == -1) {
                return -1;
            }
            dec += decimal*Math.pow(16, hex.length()-1-i);
        }
        return dec;
    }

    public static int char2Int(char c) {
        if(c>='0' && c<='9') {		// c=2: if(50>=48 && 50>=57)
            return c - '0';			// return 50-48
        }
        else if(c>='A' && c<='F') {
            return c - 55;
        }
        else {
            return -1;
        }
    }

}
