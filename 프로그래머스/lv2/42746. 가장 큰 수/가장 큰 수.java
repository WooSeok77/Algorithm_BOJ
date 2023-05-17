import java.util.Arrays;
class Solution {
    public String solution(int[] numbers) {
        
        String[] number = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            number[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(number, (o1,o2) -> (o2 + o1).compareTo(o1 + o2));
        
        if(number[0].equals("0")) {
            return "0";
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < numbers.length; i++) {
            answer.append(number[i]);
        }
        
        
      
        
        return answer.toString();
    }
}