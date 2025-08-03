public class BinaryRep {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(BinaryRep1(n));
    }

    private static int BinaryRep1(int n){
        char[] x = Integer.toBinaryString(n).toCharArray();
        int count=0;
        
        for(int i=0; i<x.length; i++){
            if (x[i] == '1'){
                count++;
            }
        }
        return count;      
    }
}
