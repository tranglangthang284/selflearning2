import java.util.Scanner;
// dòng này dùng để import vào class Scanner từ thư viện (package) java.util
// (cho phép chương trình đọc dữ liệu đầu vào từ người dùng)

public class ioVariable {
    //dòng này để define 1 lớp có tên là ipVariable
    //tên lớp phải trùng với tên tệp được lưu là ioVariable.java
    public static void main(String[] args) {
        //phương thức main là điểm bắt đầu của chương trình
        //khi chương trình đc chạy thì nội dung trong phương thức này sẽ được thực thi
        ioVariable stepA = new ioVariable();
        //dòng này dùng để tạo 1 object là stepA của class ioVariable
        stepA.a01();
        //sau đó gọi phương thức (method) a01 từ object này
        //tức là khi chương trình được thực thi thì nó sẽ thực thi các bước trong phương thức (method) a01
    }

    void a01() {
        //đây là định nghĩa của method a01
        Scanner s = new Scanner(System.in);
        //tạo 1 đối tượng Scanner có tên là s
        //new là từ khóa dùng để tạo 1 object mới trong java
        //Scanner(System.in) dùng để đọc dữ liệu đầu vào (cụ thể là bàn phím).
        //-->Cả cụm này được gọi là 1 constructor
        //sau khi dòng mã này được thực thi thì một đối tượng Scanner mới được tạo và gán cho biến s
        //sau đó có thể dử dụng biến s để gọi các method của lớp Scanner
        //ví dụ như: s.nextInt() để đọc 1 số nguyên từ đầu vào
        //           s.nextLine() để đọc 1 dòng văn bản
        //           s.next() để đọc 1 chuỗi k có khoảng trắng

        System.out.print("Enter a birth year > ");
        int birthyear = s.nextInt();
        //đọc 1 số nguyên từ đầu vào và lưu nó vào biến birthyear
        int currentYear = 2023;
        int age = currentYear - birthyear;
        System.out.println("You are " + age + " years old.");
    }
}
