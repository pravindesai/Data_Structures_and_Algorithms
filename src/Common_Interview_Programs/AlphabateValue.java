import java.util.HashMap;
import java.util.Scanner;

// a=0, b=1, c=a+b, d=c+b e=d+c ......
// find the addition of characters of string
public class AlphabateValue{
    public static void main(String[] args) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            if (alphabet=='a'){
                map.putIfAbsent(alphabet,0);
                continue;
            }
            if (alphabet=='b'){
                map.putIfAbsent(alphabet,1);
                continue;
            }
            map.putIfAbsent(alphabet, map.get(getChar(alphabet,-1)) + map.get(getChar(alphabet,-2)));
        }

        String str = "MAN";
        int addition = 0;

        Scanner sc= new Scanner(System.in);
        str= sc.nextLine();

        for(int i=0;i<str.length();i++){
            addition = addition+ map.get(Character.toLowerCase(str.charAt(i)));
        }

        System.out.println("addition "+addition);
        
    }

    static char getChar(char c, int step){
        return (char) (c + step);
    }
}
