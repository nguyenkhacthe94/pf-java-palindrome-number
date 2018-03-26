import java.util.Scanner;

public class PalindromeInteger {
    public static int isPalindrome(int number) {
int reverse = 0;
while (number > 10) {
int rem  = number % 10;
number /=10;
reverse = reverse*10 + rem;
}
reverse = reverse*10+number;
return reverse;
    }
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter number to check: ");
int numb = input.nextInt();
int rev = isPalindrome(numb);
if (rev == numb) System.out.print("\n" +numb + " is a palindrome number");
else System.out.print("\n" + numb + " is not a palindrome number");
    }
}
