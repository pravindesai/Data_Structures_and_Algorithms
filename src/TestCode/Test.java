package TestCode;

interface a{
    public int add(int x, int y);
}

class addition implements a{

    @Override
    public int add(int x, int y) {
        return x+y;
    }
}

public class Test {

    public static void main(String[] args) {
        a A = new addition();

        System.out.println(A.add(1,2));

    }
}
