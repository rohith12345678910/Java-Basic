package Challenge;

public class Day21 {
    public static void main(String[] args) {
        String s = "madam";
        char[] str = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (str[i] != str[j]) {
                System.out.println("Not a palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
    }
}
