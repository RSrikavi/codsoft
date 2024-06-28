import java.util.Random;
import java.util.Scanner;

public class NumberChallenge
{
public static void main(String args[])
{
Scanner scanner=new Scanner(System.in);
Random random=new Random();
boolean playAgain=true;
int totalscore=0;
int round=1;
while (playAgain)
{
int numberToAssume=random.nextInt(100) + 1;
int attempts=0;
int maxAttempts=8;
boolean AssumedCorrectly=false;
System.out.println("Round" + round +":Assume number between 1 and 100.you have " + maxAttempts + " attempts.");
while(attempts < maxAttempts)
{
System.out.print("Enter your Assume:");
int userAssume=scanner.nextInt();
attempts++;
if(userAssume < numberToAssume)
{
System.out.println("too insuficient !");
}
else if(userAssume > numberToAssume)
{
System.out.println("Too Excessive !");
}
else
{
System.out.println("Right! you'd Assumed the number in " + attempts + "attempts.");
totalscore+=(maxAttempts - attempts +1);
AssumedCorrectly=true;
break;
}
}
if (!AssumedCorrectly)
{
System.out.println("you'd used all your attempts. The number was" + numberToAssume + ".");
}
System.out.println("Will you want to play another Round?(yes/no:");
playAgain=scanner.next().equalsIgnoreCase("yes");
round++;
}
System.out.println("Game over!  Your total score is:" + totalscore);
scanner.close();
}
}