public class BinaryRep {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(BitCount2(n));
    }

    private static int BitCount1(int n){
        char[] x = Integer.toBinaryString(n).toCharArray();
        int count=0;
        
        for(int i=0; i<x.length; i++){
            if (x[i] == '1'){
                count++;
            }
        }
        return count;      
    }

    private static int BitCount2(int n){
        return Integer.bitCount(n);
    }
}
