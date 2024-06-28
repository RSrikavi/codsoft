import java.util.Scanner;
public class StudentsGrade
{
public static void main (String  args[])
{
Scanner scanner=new Scanner(System.in);
System.out.print("enter the no.of subjects:");
int numSubjects=scanner.nextInt();
int[]scores=new int[numSubjects];
for(int i=0;  i< numSubjects;i++)
{
System.out.print("enter scores for subject" + (i + 1) + "(out of 100):");
scores[i]=scanner.nextInt();
}
int totalScores=0;
for(int score:scores)
{
totalScores += score;

}
double averagepercentage=(double) totalScores / numSubjects;
String grade;
if (averagepercentage >= 90)
{
grade ="A";
}
else if (averagepercentage>=80)
{
grade ="B";
}
else if(averagepercentage>=70)
{
grade= "C";
}
else if(averagepercentage>=60)
{
grade= "D";
}
else
{
grade ="F";
}
System.out.println("TotalScores:" + totalScores);
System.out.println("Averagepercentage:" + averagepercentage+"%");
System.out.println("Grade:" +grade);
scanner.close();
}
}

