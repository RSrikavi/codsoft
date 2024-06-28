import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
public class Quizz
{
private static int currentQuestionIndex=0;
private static int score=0;
private static final int TIME_LIMIT=10; // seconds

private static String[][] questions={
{"Who is the president of USA?","Barack Obama","Joe Biden","Donald Trumph","Nelson Mandela", "B"},
{"who is the captain of Indian Cricket Team?","Virat kholi","Rohit Sharma","MS Dhoni","Rahul Dravid","B"},
{"what is the Synonymn of Success?","Failure","defeat","Triumph","looser","c"}
};
 private static boolean timeUp=false;
public static void main(String[] args) 
{
Scanner scanner=new Scanner(System.in);
for (currentQuestionIndex =0;currentQuestionIndex < questions.length; currentQuestionIndex ++)
{
displayQuestion();
Timer timer=new Timer();
timeUp=false;
timer.schedule(new TimerTask() 
{
public void run()
{
timeUp=true ;
System.out.println("\n Time's up!");
}
},TIME_LIMIT *10000);
System.out.print("your answer:");
String answer=scanner.nextLine().toUpperCase();
timer.cancel();
if(!timeUp)
{
checkAnswer(answer);
}
}
showResults();
scanner.close();
}
private static void displayQuestion() 
{
String[] question= questions[currentQuestionIndex];
System.out.println((currentQuestionIndex + 1) + "." +questions[0]);
System.out.println("A." + question[1]);
System.out.println("B." + question[2]);
System.out.println("C." + question[3]);
System.out.println("D." + question[4]);
}
private static void checkAnswer(String answer)
{
if(!answer.isEmpty() && answer.charAt(0)== questions[currentQuestionIndex][5].charAt(0))
{
score++;
System.out.println("correct!");
}
else
{
System.out.println("Incorrect!");
}
}
private static void showResults()
{
System.out.println("\n Quiz Over!");
System.out.println("Final score:" + score + "/" + questions.length);
for(int i=0;i< questions.length;i++)
{
String correctAnswer=questions[i][5];
System.out.println("Q" +( i + 1) + ":" + questions[i] [0]);
System.out.println("correct Answer:"+ correctAnswer + "."+ questions[i][correctAnswer.charAt(0) - 'A' + 1]);
System.out.println();
}
}
}