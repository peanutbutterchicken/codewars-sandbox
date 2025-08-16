public class MultipleOf3And5 {
    public static void main(String[] args){
        int number = 10;
        System.out.println(solution(number));
    }

    private static int solution(int number){
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        return sum;
    }
}

