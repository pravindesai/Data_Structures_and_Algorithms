package Common_Interview_Programs;

public class pyramidPattern {
    public static void main(String[] args) {
        int n=5;

        pattern(n);

    }

    private static void pattern(int n) {
        String s = "*";
        for(int i=0;i<n;i++) {
            System.out.println(s);
            s+="*";
        }
    }
}
