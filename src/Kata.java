import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata
{
    public static int ConvertToNumber(String num)
    {
        int x = Integer.parseInt(num);
        return x;
    }

    public static Integer basicMath(String op, int v1, int v2)
    {
        // first determine what operation is going to do.
        Integer value = 0;
        if(op.equals("+"))
        {
            value = v1 + v2;
        }
        else if(op.equals("-"))
        {
            value = v1 - v2;
        }
        else if(op.equals("*"))
        {
            value = v1 * v2;
        }
        else if(op.equals("/"))
        {
            value = v1 / v2;
        }
        return value;
    }

    public static String repeatStr(final int repeat, final String string) {
        String newString = "";
        for(int i = 0; i < repeat; i++) {
            newString += string;
        }
        return newString;
    }

    public static int grow(int[] x){
        int total = 1;
        for(int item : x)
        {
            total *= item;
        }
        return total;
    }

    public static String numberToString(int num) {
        // Return a string of the number here!
        return Integer.toString(num);
    }

    public static int[] invert(int[] array) {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = array[i] * -1;
        }
        return array;
    }


    public static int areaOrPerimeter (int l, int w) {
        if(l == w)
        {
            return l * w;
        }
        else
            return l*2 + w*2;
    }

    public class TotalPoints {

        public static int points(String[] games) {
            //implement me
            int wins = 0;
            for(String game : games) {
                String[] str = game.split(":");
                int x = Integer.parseInt(str[0]);
                int y = Integer.parseInt(str[1]);
                if (x > y) {
                    wins += 3;
                }

                if(x == y)
                {
                    wins ++;
                }
            }
            return wins;
        }


        public static int[] reverseArray(long number) {
            String numStr = Long.toString(number);
            int size = ("" + number).length(); // this is some cool code.
            // Reverse the string
            StringBuilder reversed = new StringBuilder(numStr).reverse();

            // Initialize an array to store reversed digits
            int[] reversedArray = new int[numStr.length()];

            // Convert characters back to integers and store in the array
            for (int i = 0; i < numStr.length(); i++) {
                reversedArray[i] = Character.getNumericValue(reversed.charAt(i));
            }

            return reversedArray;
        }


        public static int[] digitize(long n) {
            int[] arr = reverseArray(n);
            return arr;
        }

        public static int findSmallestInt(int[] args) {
            int lowest = Integer.MAX_VALUE;
            for(int x : args)
            {
                if(lowest > x)
                {
                    lowest = x;
                }
            }
            return lowest;
        }

        public static int sum(int[] numbers)
        {
            // If an empty value ( null, None, Nothing etc. ) is given instead of an array, or the given array is an empty list or a list with only 1 element, return 0.
            if(numbers == null ||numbers.length == 0 || numbers.length == 1)
            {
                return 0;
            }
            int sum = 0;
            int highest = Integer.MIN_VALUE;
            int lowest = Integer.MAX_VALUE;
            for(int x = 0; x < numbers.length; x++)
            {
                if(numbers[x] > highest)
                {
                    highest = numbers[x];
                }
                if(numbers[x] < lowest)
                {
                    lowest = numbers[x];
                }
                sum += numbers[x];
            }
            sum -= highest;
            sum -= lowest;
            return sum;
        }
    }


    public static int sortDesc(final int num) {
        String numstr = Integer.toString(num);
        System.out.println(numstr);
        String sortedString = "";
        int[] sortedArray = new int[numstr.length()];


        for(int i = 0; i < numstr.length(); i++) {
            sortedArray[i] = Character.getNumericValue(numstr.charAt(i));
        }
        StringBuilder reversed = new StringBuilder(numstr).reverse();
        sortedString = Arrays.toString(sortedArray);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(reversed.toString());
        return Integer.parseInt(reversed.toString());
    }

    /*
    Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?".
     */

    public static String greet(String name)
    {
        // Your code here
        String greeting = "Hello " + name + " how are you doing today?";
        return greeting;
    }
    //Write function bmi that calculates body mass index (bmi = weight / height2).
    //
    //if bmi <= 18.5 return "Underweight"
    //
    //if bmi <= 25.0 return "Normal"
    //
    //if bmi <= 30.0 return "Overweight"
    //
    //if bmi > 30 return "Obese"
    public static String bmi(double weight, double height) {
        double bmi = weight / (java.lang.Math.pow(height, 2));
        if(bmi <= 18.5)
            return "Underweight";
        else if(bmi <= 25.5)
            return "Normal";
        else if(bmi <= 30)
            return "Overweight";
        else
            return "Obese";
    }


    //countBy(1,10)  // should return  {1,2,3,4,5,6,7,8,9,10}
    //countBy(2,5)  // should return {2,4,6,8,10}
    public static int[] countBy(int x, int n){
        int[] counts = new int[n];
        for(int i = 1; i <= n; i++)
        {
            counts[i-1] = i * x;
        }

        for(int lame : counts)
        {
            System.out.println(lame);
        }
        return counts;
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        int average = 0;
        for(int i = 0; i < classPoints.length; i++)
        {
            average += classPoints[i];
        }
        average /= classPoints.length;
        if(average > yourPoints)
            return false;
        else
            return true;
    }

    public static String obfuscate(String email) {
        final String dot = " [dot] ";
        final String at = " [at] ";
        for(int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@') {
                email = email.replace("@", at);
            }
            if(email.charAt(i) == '.') {
                email = email.replace(".", dot);
            }
        }
        return email;
    }

    public static String MakeUpperCase(String str){
        String upper = str.toUpperCase();
        return upper;
    }

    public int GetSum(int a, int b)
    {
        //Good luck!
        if( a == b)
        {
            return a;
        }
        return a + b;
    }
    /*

     */
    public static boolean isTriangle(int a, int b, int c){
        if(a <=0 || b <= 0 || c <= 0)
            return false;
        else {
            boolean condition1 = (a + b > c);
            boolean condition2 = (a + c > b);
            boolean condition3 = (b + c > a);

            // Return true if all conditions are satisfied
            return condition1 && condition2 && condition3;
        }
    }

    public static String remove(String str) {

        // your code here
        return str.substring(1, str.length() - 1);
    }

    public static int sum(int[] arr){
        int[] sum = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > 0)
                sum[i] = arr[i];
        }
        int total = 0;
        for(int i = 0; i < sum.length; i++)
        {
            total += sum[i];
        }
        return total;
    }

    public static String areYouPlayingBanjo(String name) {
        // Program me!
        if(name.charAt(0) == 'R' || name.charAt(0) == 'r')
        {
            return name + " is playing Banjo";
        }
        else
            return name + " is not playing Banjo";
    }

    public static double sum(double[] numbers) {
        double total = 0.0;
        if(numbers.length == 0)
        {
            return 0.0;
        }
        else{
            for(int i = 0; i < numbers.length; i++)
            {
                total += numbers[i];
            }
            return total;
        }
    }


    public static int doubleInteger(int i) {
        // Double the integer and return it!
        return i*2;
    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int missingSheep = 0;

        for(int i = 0; i < arrayOfSheeps.length; i++)
        {
            if(arrayOfSheeps[i] != null) {
                if (arrayOfSheeps[i] == true) {
                    missingSheep++;
                }
            }
        }
        return missingSheep;
    }

    public static String convert(boolean b) {
        if (b)
            return "true";
        else
            return "false";
    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        if(employed && vacation)
            return false;
        else
        {
            if(employed && !vacation)
                return true;
            else
                return false;
        }
    }

    public static Object[] removeEveryOther(Object[] arr) {
        Object[] result = new Object[(arr.length + 1 )/ 2];
        result[0] = arr[0];
        int indexOfResult = 0;
        for(int i = 1; i < arr.length; i+=2)
        {
            result[indexOfResult++] = arr[i];
        }
        return result;

    }

    public static String[] solution(String s) {
        //Write your code here
        String[] solution = new String[(s.length() + 1 ) / 2];
        int solutionIndex = 0;
        for (int i = 0; i < s.length(); i += 2)
        {
            if(i + 1 < s.length())
            {
                solution[solutionIndex] = s.substring(i, i + 2);
            }
            else
            {
                solution[solutionIndex] = s.substring(i) + "_";
            }
            solutionIndex++;
        }

        return Arrays.copyOf(solution, solutionIndex);
    }


    /*
    Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

    Return your answer as a number.
     */
    public int sum(List<?> mixed) {
        int sum = 0;
        for(Object obj : mixed)
        {
            if(obj instanceof String)
            {
                sum += Integer.parseInt((String) obj);
            }
            else if(obj instanceof Integer)
            {
                sum += (Integer) obj;
            }
            else
                throw new IllegalArgumentException("Not a correct argument for this");
        }
        return sum;
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        // Your code here!
        double milesLeft = mpg * fuelLeft;
        if(distanceToPump > milesLeft)
            return false;
        else
            return true;
    }

    public static String solutionReverse(String str) {
        // Your code here...
        String reverseMe = "";
        for(int i = str.length() - 1; i >= 0; i--) {
            reverseMe += str.charAt(i);
        }
        return reverseMe;
    }

    public static String disemvowel(String str) {
        // Code away...
        String vowels = "aeiouAEIOU"; // declare this map of strings.
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(vowels.indexOf(ch) == -1)
            {
                sb.append(ch); // if there's no vowel let's append it.
            }
        }
        return sb.toString();
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //Code here ;)
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<>();
        for(int elem : elements)
        {
            int count = map.getOrDefault(elem, 0);
            map.put(elem, count + 1);
            if(count < maxOccurrences)
            {
                result.add(elem);
                map.put(elem, count + 1);
            }
        }
        int [] res = new int[result.size()];
        for(int i = 0; i < result.size(); i++)
        {
            res[i] = result.get(i);
        }
        return res;
    }

    public static String hoopCount(int n){
        if(n >= 10)
        {
            return "Great, now move on to tricks";
        }
        else
        {
            return "Keep at it until you get it";
        }
    }

    static String removeExclamationMarks(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch != '!')
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static boolean contains(int [] arr, int target)
    {
        for(int iwishautoexisted : arr)
        {
            if(iwishautoexisted == target)
                return true;
        }
        return false;
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        int [] diff = new int[a.length];
        int index = 0;
        for(int n : a)
        {
            if(!contains(b, n))
            {
                diff[index++] = n;
            }
        }
        return Arrays.copyOf(diff, index);
    }

    public static final String generateShape(int n) {
        StringBuilder sb = new StringBuilder();
        // Ensure size is between 1 and 50
        n = Math.max(1, Math.min(n, 50));

        // Loop to print each row
        for (int i = 0; i < n; i++) {
            // Print each column for the current row
            for (int j = 0; j < n; j++) {
                sb.append("* ");
                System.out.print("* ");
            }
            // Move to the next line after printing each row
            sb.append("\r\n");
            System.out.println();

        }
        return sb.toString();
    }

    // this is for an exclusive xor...
    public static boolean xor(boolean a, boolean b) {
        //your code here:
        if(a == true || b == true)
            return true;
        else
            return false;
    }

    // let's do our own thing now and try to read from a file!
    public static List<String> readFile(String filename) throws FileNotFoundException {
        List<String> result = new ArrayList<>();
        try
        {
            Scanner sc = new Scanner(new File(filename));
            String temp = "";
            while(sc.hasNextLine())
            {
                temp += sc.nextLine();
                result.add(temp);
            }

        }catch(FileNotFoundException e)
        {
            System.out.println(e.toString());
        }
        return result;
    }

    public static int sumNoDuplicates(int[] arr){
        //Put your code here ʌ_ʌ
        Set<Integer> uniques = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for(int i : arr)
        {
            if(!uniques.add(i))
                duplicates.add(i);
        }

        uniques.removeAll(duplicates);
        int sum = 0;
        for(Integer i : uniques)
        {
            sum += i;
        }
        return sum;
    }

    public static boolean solution2(String str, String ending) {
        int sizeOfEnd = ending.length();
        int sizeOfStr = str.length();
        if(sizeOfEnd > sizeOfStr)
            return false;
        if(str.substring(sizeOfStr - sizeOfEnd, sizeOfStr).equals(ending))
        {
            return true;
        }
        else
            return false;
        // there's another solution too!
        /*

        return str.endsWith(ending);
         */
    }

    public static String testStreams()
    {
        List<String> names = Arrays.asList("Caleb", "Chloe", "John M", "Zelda", "Jake", "Kai");
        int sum = (int) names.stream().count();
        sum = (int) names.stream().filter(x->x.equals("Zelda")).count();
        sum = (int) names.stream().filter(x-> x.length() > 1).count();
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("C"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredNames.toString());
        List<String> filter = names.stream().filter(name -> name.length() > 1).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(filter.toString());
        List<String> characterMax = names.stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length())).collect(Collectors.toList());
        return (characterMax.toString());
    }

    public static void sortArray(List<String> names)
    {
        System.out.println(names.stream().count());
        System.out.println(names.stream().sorted((s1, s2)->Integer.compare(s1.length(), s2.length())).collect(Collectors.toList()));

    }

    public static String reverseLetter(final String str) {
        // StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Traverse the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            // Check if the character is alphabetic
            if (Character.isAlphabetic(ch)) {
                result.append(ch);
            }
        }

        // Convert StringBuilder to string and return
        return result.toString();
    }


    public static int[] reverse(int n){
        int[] result = new int[n];
        int index = 0;
        for(int i = n; i >=1; i--) {
            result[index] = i;
            index ++;
        }
        return result;
    }

    public static int[] reverseWithStreams(int n) {
        return IntStream.range(-n, 0).map(Math::abs).toArray();
    }

    public static String makeReadable(int seconds) {
        // Do something
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds);
    }

    public static String doubleChar(String s){
        //enter your code here
        StringBuilder sb = new StringBuilder();
        for(int index = 0; index < s.length(); index++) {
            sb.append(s.charAt(index) + s.charAt(index));
        }
        return sb.toString();
    }


    public static Map<Character, Integer> count(String str) {
        // Happy coding!
        Map<Character, Integer> ret = new HashMap<>();
        for(char ch : str.toCharArray())
        {
            if(ret.containsKey(ch))
                ret.put(ch, ret.get(ch) + 1);
            else
                ret.put(ch, 1);
        }
        return ret;
    }
    public static int Past(int h, int m, int s)
    {
        //Happy Coding! ^_^
        return (((h * 3600) + ( m * 60) + (s)) * 1000);
    }

    public int min(int[] list) {
        OptionalInt x = Arrays.stream(list).min();
        return x.getAsInt();
    }

    public int max(int[] list) {

        OptionalInt x =  Arrays.stream(list).max();
        return x.getAsInt();
    }

    /*
    []                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
     */
    public static String whoLikesIt(String... names) {
        //Do your magic here
        //Do your magic here
        StringBuilder sb = new StringBuilder();
        if(names.length == 0)
            sb.append("no one likes this");

        else if(names.length == 1)
        {
            sb.append(names[0]).append(" ");
            sb.append("likes this");
        }
        else if(names.length == 2)
        {
            sb.append(names[0] + " and " + names[1]);
            sb.append(" ");
            sb.append("like this");
        }
        else if(names.length == 3)
        {
            sb.append(names[0] + ", " + names[1] + " and " + names[2]);
            sb.append(" ");
            sb.append("like this");
        }
        else
        {
            sb.append(names[0] + ", " + names[1] + " and " + (names.length - 2) + " others ");
            sb.append("like this");
        }



        return sb.toString();
    }

    public static boolean  isIsogram(String str) {
        HashSet<Character> map = new HashSet<>();

        str = str.toLowerCase();
        for(char c: str.toCharArray())
        {
            if(map.contains(c))
                return false;
            else
            {
                map.add(c);
            }
        }
        return true;
    }
    public static boolean isIsogramStreams(String str)
    {
        return str.length() == str.chars().distinct().count();
    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : a)
        {
            if(map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
            {
                map.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue()  % 2 != 0)
            {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static int[] map(int[] arr) {
        int[] values = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            values[i] = arr[i] * 2;
        }
        return values;
    }

    public static int[] mapWithStreams(int[] arr)
    {
        return Arrays.stream(arr).map(x -> x*2).toArray();
    }


    public static int squareSum(int[] n)
    {
        return Arrays.stream(n).map(x->x*x).sum();
    }

    public String dnaToRna(String dna) {
        return dna.chars().mapToObj(c->(char) c).map(c->c=='T' ? 'U':'C').map(String::valueOf).collect(Collectors.joining());
    }

    public static String updateLight(String current) {
            if(current.toLowerCase().equals("green"))
                return "yellow";
            else if(current.toLowerCase().equals("yellow"))
                return "red";
            else
                return "green";

    }

    public static int sortDescNumber(final int num) {
        String numberString = Integer.toString(num);
        char[] digits = numberString.toCharArray();
        Arrays.sort(digits);
        StringBuilder sb = new StringBuilder(new String(digits));
        sb.reverse();
        return Integer.parseInt(sb.toString());

    }

    public static String firstNonRepeatingLetter(String s){
        // Add your code here
        if(s == null || s.isEmpty())
            return "";
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Convert the input string to lowercase for counting
        String lowerCaseString = s.toLowerCase();

        // Fill the frequency map with character counts
        for (char c : lowerCaseString.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character in the original string
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (frequencyMap.get(Character.toLowerCase(c)) == 1) {
                return Character.toString(c);
            }
        }
        // If no non-repeating character is found, return an empty string
        return "";
    }
}