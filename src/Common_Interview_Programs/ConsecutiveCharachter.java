package Common_Interview_Programs;

public class ConsecutiveCharachter {
    public static void main(String[] args) {

        String str = "bcccdeeeghhhhh";

        maxConsecutiveCharacter(str);

        maxConsecutiveCharacterSingleLoop(str);

    }

    private static void maxConsecutiveCharacter(String str) {
        char[] array = str.toCharArray();

        int maxCount = 1;
        char maxChar = array[0];
        for(int i = 0, j = 0; i < str.length() - 1; i = j){
            int count = 1;
            while (++j < str.length() && array[i] == array[j]) {
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = array[i];
            }
        }
        System.out.println(maxChar+" -> "+maxCount);
    }

    private static void maxConsecutiveCharacterSingleLoop(String str) {
        int maxCount = 1;
        char maxChar = str.charAt(0);
        int count = 1;

        for (int i=1; i<str.length(); i++){
            if (str.charAt(i)==str.charAt(i-1)){
                count++;
            }else {
                count = 1;
            }

            if (count>=maxCount){
                maxCount = count;
                maxChar = str.charAt(i);
            }
        }

        System.out.println(maxChar+ "--> "+maxCount);

    }
}
