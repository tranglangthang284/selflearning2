import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Operators stepC = new Operators();
        stepC.c01();
    }
    void c01(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a birth year > ");
        int birth_year = s.nextInt();
        int age = 2021 -birth_year +1;
        if(age<7)
            System.out.println("you are baby");
        else if (age >= 7 && age < 13)
            System.out.println("you are child");
        else if (age >= 13 && age < 20)
            System.out.println("you are teenager");
        else if (age >= 20 && age < 30)
            System.out.println("you are younger");
        else if (age >= 30 && age <60)
            System.out.println("you are middle age");
        else if (age >= 60)
            System.out.println("you are older");
    }
    }

