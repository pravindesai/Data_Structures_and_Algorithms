import java.util.HashMap;
import java.util.Map;

public class test extends test2{
    public static void main(String[] args) {
        String str = "vsnagdjhgajhddfgkdspf";
        Map<Character, Integer> map = new HashMap<Character,Integer>();

        for(int i=0;i<str.length(); i++){
            if(map.get(str.charAt(i)) == null){
                map.put(str.charAt(i), 1);
            }else{
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
        }

        System.out.println(map);
    }
}
