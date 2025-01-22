
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
    String s="";
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the word to check the palindrome");
    s=sc.nextLine();
    sc.close();
      if(isPalindrome(s))System.out.println(" is Palindrome");
      else System.out.println("not a palindrome");
          }


        public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char li = Character.toLowerCase(s.charAt(i));
            char lj = Character.toLowerCase(s.charAt(j));
            while (i < j && !Character.isLetterOrDigit(li)) {
                i++;
                li = Character.toLowerCase(s.charAt(i));
            }
            while (i < j && !Character.isLetterOrDigit(lj)) {
                j--;
                lj = Character.toLowerCase(s.charAt(j));
            }
            if (li != lj) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
