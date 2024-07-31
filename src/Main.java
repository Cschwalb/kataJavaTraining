// it's always a good time to practice java!
// started 6/27/2024

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        Kata.sortDesc(5444327);
        Kata.countBy(1,10);
        List<String> names = Arrays.asList("Caleb", "Chloe", "John M", "Zelda", "Jake", "Kai");
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        String sTest = "abcdef";
        System.out.println(Arrays.toString(Kata.solution(sTest)));
        System.out.println(reverseWords("     "));
        System.out.println(Kata.testStreams());
        Kata.sortArray(names);
        String toDecode = "I Like To Take Candy From A Baby";
        System.out.println(Kata.firstNonRepeatingLetter(toDecode));
    }

    public static long factorial(int n)
    {
        long fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    public static int paperWork(int n, int m)
    {
        //Happy Coding! ^_^
        if(n < 0 || m < 0)
        {
            return 0;
        }
        else
            return n * m;
    }

    public static String reverseWords(final String original)
    {
        // Have at it
        String [] words = original.split(" ");
        StringBuilder result = new StringBuilder();
        for(String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            result.append(reversedWord);
            result.append(" ");
        }
        return result.toString().trim();
    }

}