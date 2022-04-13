/*Ques1. Write a java program to take input as a command 
line 20 argument. Your name, course, university
rollno and semester Display the information.
Name:
UniversityRollNo:
Course:
Semester:*/
public class CommandLine1 {
    public static void main(String[] args) {
        String Name = args[0];
        int UniversityRollNo = Integer.parseInt(args[1]);
        String Course = args[2];
        int Semester = Integer.parseInt(args[3]);
        System.out.println("Name is :" + Name);
        System.out.println("University Roll No is :" + UniversityRollNo);
        System.out.println("Course is " + Course);
        System.out.println("Semester is " + Semester);
    }
}