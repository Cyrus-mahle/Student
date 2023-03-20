/*
*@Athor :Nyakama Mahle
*@Date  :20/03/2023
*/
import java.util.Scanner;

public class StudentApp{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

Student object = new Student();


//prompt the user
System.out.println("Enter course ");
//read course
String courseName = input.nextLine();
System.out.println();

//prompt the user
System.out.println("Enter Student number ");
//read student number
int studentNo = input.nextInt();
System.out.println();

//prompt the user
System.out.println("Enter Student Debt Fee ");
//read student number
double debt = input.nextDouble();
System.out.println();


// Output Student number
object.studentNumber(studentNo);
//output Course
object.studentCourse(courseName);
//output debt fee
object.studentDebtFee(debt);

}

}