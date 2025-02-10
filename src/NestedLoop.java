import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        NestedLoop stepE = new NestedLoop();
        stepE.e01();
    }

    void e01() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a length of rectangle");
        int length = s.nextInt();

        for (int j = 0; j < length; j++) { //vòng lặp bên ngoài outer loop: lặp qua từng hàng từ 0 đến length-1
            for (int i = 0; i < length; i++) {//vòng lặp bên trong: lặp qua từng cột từ 0 đến length-1
                System.out.print("#");//in ra kí tự # mà không xuống dòng (khac svoiws println là sẽ xuống dòng
            }
            System.out.println();//sau khi in xong 1 hàng thì xuống dòng mới để bắt đầu hàng tiếp theo
        }
    }
}

