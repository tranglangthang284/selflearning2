
import java.util.Scanner;

public class JavaMath{
    public static void main(String[] args) {
        JavaMath stepH = new JavaMath();
        stepH.h01();
    }

    void h01() {
        Scanner s = new Scanner(System.in);
        String onemore; // Biến để lưu ý kiến của người dùng xem có muốn tạo lotto nữa k

        do {
            int lotto[] = new int[6]; //mảng để lưu 6 số lotto
            int count;//biến đếm số lượng số đã tạo
            int i;//biến dùng trong vòng lặp để kiểm tra số trùng

            // Tạo số ngẫu nhiên
            for (count = 0; count < 6; count++) {
                lotto[count] = (int) ((Math.random() * 45) + 1);
                //tạo một số ngẫu nhiên từ 1 từ 45 để lưu vào mảng lotto tại vị trí count
                for (i = 0; i < count; i++) {
                    if (lotto[count] == lotto[i]) {
                        count--;
                        //nếu lotto tại ví trí count bằng lotto tại vị trí i thì giảm count để tạo lại số tránh trùng lặp
                        //dùng count-- là vì nếu dùng count++ thì nó sẽ tiếp tục tạo số tại vị trí mới mà không fill số tại vị trí cũ bị trùng
                        break;
                        //lúc này nếu có trùng lặp thì nó sẽ tự động giảm count và thoát khỏi vòng lặp trong
                        //sau khi đã thoát khỏi vòng lặp trong thì nó sẽ ra vòng lặp ngoải và thực hiện với giá trị count đã giảm
                    }
                }
            }

            // In ra số Lotto đã tạo
            System.out.print("The generated lotto numbers are: ");
            for (count = 0; count < 6; count++)
                System.out.print(lotto[count] + " ");
            //truy cập vào mảng lotto vị trí count và sẽ lấy ra 1 trong những số ngẫu nhiên đã được tạo trước đó
            System.out.println(); //dòng này chỉ để xuống dòng thôi

            // Hỏi người dùng có muốn tạo thêm không
            System.out.print("Do you want to generate more lotto numbers (Y/N)? ");
            onemore = s.nextLine().trim().toUpperCase(); // Đọc ý kiến và chuẩn hóa
            //nextLine được dùng để đọc dữ liệu đầu vào và trả nó dưới dạng String
            //trim() được dùng để loại bỏ khoảng trắng (spaces) ở đầu và cuối chuỗi
            //toUpperCase() dùng để chuyển đổi tất cả các ký tự trong chuỗi thành chữ hoa

        } while (onemore.equals("Y")); // Tiếp tục nếu người dùng nhập 'Y'
        //.equals ("Y") được dùng để so sánh nội dung của chuỗi onemore với chuỗi "Y"
        //phương thức này sẽ trả về true nếu cả hai chuỗi có nội dung giống nhau (nếu ng dùng nhập vào "Y"), false nếu không
        System.out.println("Thank you for using the Lotto Generator!");
    }
}