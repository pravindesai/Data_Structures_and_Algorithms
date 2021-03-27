package Common_Interview_Programs;

public class Patterns {
    public static void main(String[] args) {

        Pattern1();
        Pattern2();
        Pattern3();
        Pattern4();

    }

    public static void Pattern1(){
        /*

                      *
                    ***
                  *****
                *******

         */

        int n=7;
        int cnt = n;

        for (int i=0;i<=n;i++){

            cnt--;
            if (i%2 != 0) continue;


            for (int j=0;j<cnt;j++){
                System.out.print(" ");
            }
            for (int k=cnt; k<n; k++){
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public static void Pattern2(){
        /*

         *
         ***
         *****
         *******

         */

        int n=7;

        for (int i=0;i<=n;i++){
            if (i%2 == 0) continue;
            for (int j=0;j<i;j++){
                System.out.print("#");
            }
            System.out.print("\n");
        }

    }

    public static void Pattern3(){
        /*

         *
        ***
       *****
      *******

         */

    }

    public static void Pattern4(){
        /*

         1
        234
       56789
      1234567

         */

    }
}


