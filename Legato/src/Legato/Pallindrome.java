package Legato;

public class Pallindrome {
        public static void main(String args[]) {
            String vai = "vai";
            String reverse = "";
            int length = vai.length();

            for (int i = length - 1; i >= 0; i--) {
                reverse = reverse + vai.charAt(i);
            } 

            
   
            if (vai.equals(reverse)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("not a Palindrome");
            }
        }
    }
