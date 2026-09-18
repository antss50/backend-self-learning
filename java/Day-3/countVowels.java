import java.util.*;

public class countVowels {
    public static void main(String[] args) {
        String text = "Hello World";
        int countVowels = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                countVowels++;
            }
        }
        System.out.println(countVowels);
    }
}