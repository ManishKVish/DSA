public class Recursion_factorial{
    public static void main {
        int i = product(5,3);
        System.out.println(i);

    }
    public static int product(int i, int j){
        if (i<j){
            product (j,i)
        }
        if (j==1)return;
        int sum = product(i, j-1)
        return =  sum+i;
    }
}
