package Common_Interview_Programs;
import java.util.*;
import java.util.stream.Collectors;

public class ArrangleArrayElementsByCount {
    public static void main(String[] args) {
        //1332224444    --> PRINT -->  4444222331

        int[] array = new int[]{4,1,3,3,2,2,2,4,4,4};

        int[] newArray = arrange(array);
        for (int i: newArray){
            System.out.print(i+"  ");
        }

    }

    public static int[] arrange(int[] array){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i : array){
            if (!map.containsKey(i)){
                map.put(i, 1);
            }else {
                int c = map.get(i);
                map.put(i, ++c);
            }
        }

        map = sortHashmap(map);

        for (int key: map.keySet()){
            for (int i=0;i<map.get(key);i++){
                arrayList.add(map.get(key));
            }
        }

        int[] arr = arrayList.stream().mapToInt(i -> i).toArray();

        return arr;
    }

    public static HashMap<Integer, Integer> sortHashmap(HashMap<Integer, Integer> map){

        return map.entrySet()
                .stream()
                .sorted((Map.Entry.<Integer, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}
