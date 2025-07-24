public class trolls {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        String sentence = "This is a hate comment! i haet u XD";  
        System.out.println(disemvowel(sentence));
    }
}
