package Common_Interview_Programs;

public class isPalindrome {

    public static void main(String[] args) {
        String str = "abcddcbaa";

        System.out.println(str+" is "+isPanindrome(str));
    }

    private static String isPanindrome(String str) {
        int sIndex = 0;
        int lIndex = str.length()-1;

        while(sIndex<=lIndex){
            if (str.charAt(sIndex) == str.charAt(lIndex)){
                sIndex++;
                lIndex--;
            }else {
                return "Not Palindrome";
            }
        }
        return "Palindrome";
    }
}
