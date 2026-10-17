package Array_Data_Structures.com.dynamicProgramming;

public class Demo {

    public static void main(String[] args) {

        int n = 6;

        int val = fun(n);
        System.out.println(val);
    }

    private static int fun(int n) {

        if (n <= 1){
            return n;
        }

        return fun(n-1)+fun(n-2);
    }
}
