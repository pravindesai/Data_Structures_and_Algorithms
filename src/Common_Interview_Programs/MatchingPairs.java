package Common_Interview_Programs;

public class MatchingPairs {
    public static void main(String[] args) {
        int [][] arr = {{11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}};
        int len = arr.length;

        findpairs(arr, len);
    }

    private static void findpairs(int[][] arr, int len) {
        // {a,b} {c,d}   a==d, c==b

        for (int a[]:arr) {
            for (int b[]:arr) {
                if (a[0]==b[1] && a[1]==b[0]){
                    System.out.println("Pair--> {"+a[0]+","+a[1]+"}");
                }
            }
        }

    }
}
