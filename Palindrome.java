/*
Hi,
This is not a simple palindrome-number check function, rather,
this program emphasizes the use of Palindrome Pair Theory, and a efficient implementation of it.
Please check out the derivation first, to make things clear.
Don't forget to check the program out !
CMD : javac Palindrome.java
      java Palindrome
*/
import java.util.*;
class Palindrome
{
    public static void main(String [] args) throws IOException
    {
        int in=new Scanner(System.in).nextInt();
        System.out.println("IS PAILNDROME : "+isPalindrome(in));        //Asking and printing value.
    }
    private static int power;
    private static boolean isPalindrome(int n)
    {
        int digits=count(n);
        if(digits%2==1)n=evenize(n);            //We are simply evenizing a odd input number, to apply Pair Theory for even numbers.
        return (n % 11 == 0 && (evenize(n / 11) % 11 == 0));
    }
    private static int evenize(int n)
    {
        return 10 * (n - (n % power)) + n % (power * 10);
    }
    private static int count(int n)
    {
        power=1;
        int c=0;
        while(n>=1)
        {
            n/=10;
            c++;
            if(c%2==0)power*=10;
        }
        return c;
    }
}
