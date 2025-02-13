import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        StringManipulator stepH = new StringManipulator();
        stepH.h08();
    }

    void h08() {
        Scanner s = new Scanner(System.in);
        while (true) {//bắt đầu 1 vòng lặp vô hạn
            //bên trong dấu ngoặc là true, có nghĩa là điều kiện này luôn đúng, vòng lặp sẽ chạy mãi
            // cho đến khi có 1 lệnh nào đó bên trong yêu cầu kết thúc
            System.out.println("===============================");
            System.out.print("=> Enter a sentence ('x' for exit) > ");
            String input = s.nextLine();
            if (input.equals("x")) {//kiểm tra nếu người dùng nhập 'x'
                break;//thoát vòng lặp nếu nhập 'x'
            }

            System.out.print("Enter a sentence to find > ");
            String findStr = s.nextLine();//đọc chuỗi cần tìm
            System.out.print("Enter a sentence to replace > ");
            String replaceStr = s.nextLine();//đọc chuỗi thay thế
            //nextLine sẽ đọc toàn bộ văn bản cho đến khi gặp kí tự xuống dòng
            //next thì chỉ đọc từ đầu cho đến khi gặp spave,tab, hoặc ký tự xuống dòng

            int index = 0;//để theo dõi vị trí tìm kiếm
            int cnt = 0;//để đếm số lần tìm thấy
            while (true) {
                index = input.indexOf(findStr, index);//tìm vị trí của findStr trong input từ vị trí index
                if (index == -1) break;//nếu index=-1 tức là không tìm thấy thì sẽ thoát vòng lặp
                index++;//tăng index lên 1 để tìm kiếm xuất hiện tiếp theo
                cnt++;//tăng biến đếm cnt lên 1
            }

            input = input.replace(findStr, replaceStr);//thay thế tất cả các xuất hiện của findStr bằng replaceStr
            System.out.println(cnt + "회 변경");//in ra số lần thay đổi
            System.out.println(input);//in ra input đã được thay đổi


        }
    }
}

