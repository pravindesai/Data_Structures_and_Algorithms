package Common_Interview_Programs;
import java.util.HashMap;

public class Count_Occurence_of_each_character_in_String {
    public static void main(String[] args) {
        String s = "pravindesai";
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();

        for(int i=0;i<s.length(); i++){
            //System.out.println(s.charAt(i));
            if(map.get(s.charAt(i)) == null)
                map.put(s.charAt(i),1);
            else
            {
                int c= map.get(s.charAt(i));
                map.put(s.charAt(i),++c);
            }

        }

        System.out.println(map);
    }
}





