public class phoneNumber {
    public static void main(String[] args) {    // input and method caller
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        String phoneNum = createPhoneNumber2(numbers);
        System.out.println(phoneNum);
    }
    
    public static String createPhoneNumber1(int[] numbers){ // Method 1: using .format from c
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", numbers[0], numbers[1], numbers[2], numbers[3], numbers[4], numbers[5], numbers[6], numbers[7], numbers[8], numbers[9]);
    }

    public static String createPhoneNumber2(int[] numbers){ // Method 2: using .replaceFirst
        String phoneNumber = new String("(xxx) xxx-xxxx");
        for(int i : numbers){
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(numbers[i-1]));
        }

        return phoneNumber;
    }
}
