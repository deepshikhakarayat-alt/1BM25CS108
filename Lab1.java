import java.util.Scanner;
class Student{
    int USN;
    String name;
    void accept(){
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter USN:");
        USN = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name:");
        name = sc.nextLine();
   }
   void display(){
       System.out.println("USN="+USN);
       System.out.println("Name="+name);
   }
}
public class Lab1{
   public static void main(String args[]){
       Student S1 = new Student();
       Student S2 = new Student();
       S1.accept();
       S2.accept();
       S1.display();
       S2.display();
   }
}
