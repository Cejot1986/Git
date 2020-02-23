import java.util.Arrays;

public class PalindromeChecker {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        System.out.println(palindromeChecker.checkPalindrome(stringUtils.prepareString("Ada jaja Jada")));
    }

     public boolean checkPalindrome (String stringToCheck){
        char [] chars = stringToCheck.toCharArray();
        int j = 0;
        for (int i = chars.length - 1; i >= chars.length/2; i--){
            if (chars[j] != chars[i]) {
                return false;
            }

            j++;
        }
        return true;

    }
}
