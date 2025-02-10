import java.util.Scanner;

public class ConditionLoop {
    public static void main(String[] args) {
        ConditionLoop stepD = new ConditionLoop();
        stepD.d01();
    }
    void d01(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number > ");
        int number = s.nextInt();
        if (number < 1) {
            System.out.println("invalid input");
            return; //dừng thực hiện nếu đầu vào không hợp lệ
            //trường hợp không có return này thì vẫn sẽ in ra là invalid input
            //tuy nhiên nó cũng vẫn sẽ in ra dòng ở sout bên dưới
        }
        int totalsum = 0;
        int i;

        for (i = 1; i <= number; i++){
            totalsum = totalsum + i; //hoặc có thể sử dụng là totalsum += i
        }
        System.out.println("The sum of all interger from 1 to the number entered is " + totalsum);
    }
}
