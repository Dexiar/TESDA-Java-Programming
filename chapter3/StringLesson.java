package chapter3;

public class StringLesson {
    public static void main(String[] args) {
        String name = "Fluffy";
        String a =  "1";
        a = "0";
        a+= "2";
        a+= "3";
        String b = "1";
        String name2 = "Fluffy";
        String name3 = new String("Fluffy");
        System.out.println(a);
        
        System.out.println(name2.length()); //.length()
        System.out.println(name2.charAt(1));

        String word1 = "Stand alone";
        System.out.println(word1.toUpperCase());
        System.out.println(word1.toLowerCase());
        
        String word2 = "ABC";
        System.out.println(word2.equals("ABC"));
        System.out.println(word2.equals("abc"));
        System.out.println(word2.equalsIgnoreCase("ABC"));

        System.out.println("abcabc".replace('a', 'A'));

        String trimSample = "           \t \n \t Lan Sevilleno \t \n";
        System.out.println(trimSample.trim());

        String limitString = "abcdefghijklmnopqrstwxyzabcdefghijklmnopqrstwxyzabcdefghijklmnopqrstwxyzabcdefghijklmnopqrstwxyzabcdefghijklmnopqrstwxyz";
        System.out.println(limitString);
        String limString = "abcde";
        String limString2 = "abcde";
        System.out.println(limString == limitString);
        System.out.println(limString == limString2);
    }
}


