/*public class factorialbyforloop {
    public static void main(String[] args) {
        int n=5;
        int fact=1;
        for(int i=1;i<=7;i++)
        {
            fact= fact*i;
        }
        System.out.println(fact);

    }
}*/
public class factorialbyforloop{
    public static void main(String[] args) {
        int fact=1;
        int i=0;
        int n=5;
        while(i<n)
        {
            i=i+1;
            fact=fact*i;

        }
        System.out.println(fact);
    }
}
