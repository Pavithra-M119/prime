import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Prime.prime(num));


    }
}
class Prime
{
    static String prime(int num)
    {
        int temp=0;
        for(int i = 2 ; i <= num / 2 ; i++)
        {
            if(num % i == 0)
            {
                temp=1;
                break;
            }
        }
        if (temp != 1)
            return "The number is a Prime";
        else
            return "The number is not Prime";
    }
}