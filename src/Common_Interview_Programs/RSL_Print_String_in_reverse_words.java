package Common_Interview_Programs;

public class RSL_Print_String_in_reverse_words {
    public static void main(String[] args) {
        //Raja Software Labs  -->  Labs Software Raja
        String str = "Raja Software Labs";
        String newStr = "";
        String tempString = "";


        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (i>=str.length()-1 || c==' '){
                newStr = tempString+c+" "+newStr;
                tempString = "";
            }else {
                tempString = tempString+c;
            }

        }

        System.out.println(newStr);


    }
}
