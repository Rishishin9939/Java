import java.util.Scanner;
public class Gradecalculator{
  public static void main(String[] args) {
    int a1;
    int a2;
    int a3;
    int a4;
    int a5;
      Scanner obj = new Scanner(System.in);
     System.out.println("Enter the marks of all subjects:-");
    System.out.println("1) English Marks-");
    a1 = obj.nextInt();
    System.out.println("2) Hindi Marks-");
    a2 = obj.nextInt();
    System.out.println("3) Math Marks-");
    a3 = obj.nextInt();
    System.out.println("4) Science Marks-");
    a4 = obj.nextInt();
    System.out.println("5) Social Science Marks-");
    a5 = obj.nextInt();
    int percentage = (a1+a2+a3+a4+a5)/5;
    System.out.println("Result");

    if(percentage>90 && percentage<=100){
        System.out.println("Your grade is :- A+");
        System.out.println("Status :  Pass");
    }
    else if(percentage>80 && percentage<=90){
        System.out.println("Your grade is :- A");
        System.out.println("Status :  Pass");
      }
    else if(percentage>70 && percentage<=80){
        System.out.println("Your grade is :- B+");
        System.out.println("Status :  Pass");
      }
    else if(percentage>60 && percentage<=70){
        System.out.println("Your grade is :- B");
        System.out.println("Status :  Pass");
      }
    else if(percentage>50 && percentage<=60){
        System.out.println("Your grade is :- C+");
        System.out.println("Status :  Pass");
        }
    else if(percentage>40 && percentage<=50){
        System.out.println("Your grade is :- C");
        System.out.println("Status :  Barely Pass");
            }
    else{
      System.out.println("Fail");
    }
  }   
}
