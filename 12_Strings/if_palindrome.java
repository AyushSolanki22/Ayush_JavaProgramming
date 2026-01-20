public class if_palindrome {
    public static void main(String[] args) {
        //check if a string is a palindrome
        // "racecar","noon","madam"
        String s="madam";
        int i=0;
        boolean b=true;
        if (s.length()>=1) {
            while (i<=s.length()/2) {
                int j=s.length()-i-1;
                if (s.charAt(i)!=s.charAt(j)) {
                    b=false;
                    break;
                }
                ++i;
                
            }
        }
        else {
            System.out.println("Not a valid string ");
        }
        System.out.println(b!=true?"Not a palindrome":"It is a palindrome");
    }
}