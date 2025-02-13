//import java.util.Scanner;
//
//public class StringExcution {
//    public static void main(String[] args) {
//        StringExcution stepH = new StringExcution();
//        stepH.h08();
//    }
//
//    void h08(){
//        Scanner s = new Scanner(System.in);
//        System.out.print("===============================");
//        System.out.print("=> Enter a sentence ('x' for exit) > ");
//        String input = s.nextLine();
//        System.out.print("Enter a sentence to find > ");
//        String findStr = s.next();
//        System.out.print("Enter a sentence to replace > ");
//        String replaceStr = s.next();
//
//        input = input.replace(findStr, replaceStr);
//        System.out.println(input);
//
//
//
//    }
//}

import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        StringManipulator stepH = new StringManipulator();
        stepH.h08();
    }

    void h08() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.print("===============================\n");
            System.out.print("=> Enter a sentence ('x' for exit) > ");
            String input = s.nextLine();
            if (input.equals("x")) {
                break; // Thoát nếu người dùng nhập 'x'
            }
            System.out.print("Enter a sentence to find > ");
            String findStr = s.nextLine(); // Sử dụng nextLine() để đọc toàn bộ dòng
            System.out.print("Enter a sentence to replace > ");
            String replaceStr = s.nextLine(); // Sử dụng nextLine() để đọc toàn bộ dòng

            input = input.replace(findStr, replaceStr);
            System.out.println("Updated sentence: " + input);
        }
        s.close(); // Đóng Scanner để giải phóng tài nguyên
    }
}