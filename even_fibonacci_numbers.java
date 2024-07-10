import java.util.*;
public class even_fibonacci_numbers {
    public static void main(String[] args) {
        int limit = 4000000;
        int firstTerm = 1;
        int secondTerm = 2;
        int sum = 0;
        while(firstTerm < limit){
            if(firstTerm%2==0){
                sum+=firstTerm;
            }
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println(sum);
    }
}


