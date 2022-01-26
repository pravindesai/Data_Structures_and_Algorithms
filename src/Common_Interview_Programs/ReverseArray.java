package Common_Interview_Programs;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        char[] arrayChar = {'a','b','c','@','d','e','#','f','g'};

        reverseArray(array);
        reverseArrayExceptSpecialChar(arrayChar.clone());
        reverseArrayExceptSpecialCharWithoutArrayMethod(arrayChar.clone());
    }

    private static void reverseArrayExceptSpecialCharWithoutArrayMethod(char[] arrayChar) {
        int startIndex = 0;
        int endIndex   = arrayChar.length-1;

        while (startIndex<=endIndex){
            char schar = arrayChar[startIndex];
            char echar = arrayChar[endIndex];

            if (schar =='#' || schar=='@' || schar=='!' || schar=='$' || schar=='%') {
                startIndex++;
                continue;
            }
            if (echar =='#' || echar=='@' || echar=='!' ||echar=='$' || echar=='%') {
                endIndex--;
                continue;
            }

            char tempChar = arrayChar[startIndex];
            arrayChar[startIndex] = arrayChar[endIndex];
            arrayChar[endIndex] = tempChar;

            startIndex++;
            endIndex--;
        }

        System.out.println(Arrays.toString(arrayChar));

    }

    private static void reverseArrayExceptSpecialChar(char[] array) {
        int startIndex = 0;
        int endIndex = array.length-1;
        char[] specialChars = {'!','@','#','$','%','^','&','*','(',')'};


        while(startIndex<=endIndex){
            if (Arrays.toString(specialChars).contains(array[startIndex]+"")){
                startIndex++;
                continue;
            }
            if (Arrays.toString(specialChars).contains(array[endIndex]+"")){
                endIndex--;
                continue;
            }

            char temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;

            endIndex--;
            startIndex++;

        }
        System.out.println(Arrays.toString(array));

    }

    private static void reverseArray(int[] array) {
        int startIndex = 0;
        int endIndex = array.length-1;

        while (endIndex>=startIndex){
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }

        System.out.println(Arrays.toString(array));

    }
}
