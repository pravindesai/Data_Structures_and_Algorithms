package Common_Interview_Programs;

public class Interleaved {
    public static void main(String[] args) {
        char[] s1 = {'a','b','c','d'};
        char[] s2 = {'x', 'y', 'z'};
        char[] s3 = {'a','x','b','y','c', 'z', 'd'};

        System.out.println("Is interleaved -> "+isInterleaved(s1, s2, s3, s1.length, s2.length));
    }

    private static boolean isInterleaved(char[] s1, char[] s2, char[] s3, int length, int length1) {
        boolean mainFlag = false;
        boolean flag1 = false;
        boolean flag2 = false;

        for (char c: s1) {
            flag1 = false;
            for (char temp: s3) {
                if (c == temp) {
                    flag1 = true;
                }
            }
            if (!flag1) break;
        }

        for (char c: s2) {
            flag2 = false;
            for (char temp: s3) {
                if (c == temp) {
                    flag2 = true;
                }
            }
            if(!flag2) break;
        }

        if (flag1 && flag2 ) mainFlag = true;

        return mainFlag;
    }


}
