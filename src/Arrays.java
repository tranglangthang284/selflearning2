import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Arrays stepF = new Arrays();
        stepF.f01();
    }
    void f01() {
        Scanner s = new Scanner(System.in);

        int[] num = new int [10];
        for(int i = 0; i < num.length; i++) {
            System.out.print("Enter " + (i+1) + "th number > ");
            num[i] = s.nextInt();//đọc số và lưu vào mảng
        }
        //in ra các số đã nhập
//        for(int i = 0; i < num.length; i++) {
//            System.out.println(num[i]);//in ra từng số trong mảng
//        }
        //logic để tìm được số lớn thứ 2 nhu sau:
        int firstMax = Integer.MIN_VALUE; //khởi tạo biến để lưu số lớn nhất
        int secondMax = Integer.MIN_VALUE;//khởi tạo biến để lưu số lớn thứ 2
        //khởi tạo bằng Integer.MIN_VALUE là 1 hằng số trong java, là giá trị nhỏ nhất cho kiểu int
        //thường được dùng để khởi tạo biến khi muốn tìm giá trị giá trị min, max
        //điều này đảm bảo rằng bất kì số nào nhập vào cũng sẽ thay thế giá trị này
        //có thể dễ dàng kiểm tra để tìm thấy số bằng cách so sánh với Integer.MIN_VALUE sau khi vòng lặp hoàn thành


        for (int i = 0; i < num.length; i++){
        //sử dụng vòng lặp này để duyệt qua từng số trong mảng
            if (num[i] > firstMax) {
                secondMax = firstMax;
                firstMax = num[i];
            }
            //điều kiện này tức là nếu num[i]> firstMax thì sẽ cập nhật secondMax thành firstMax và firstMax sẽ là số đó
            else if (num[i] > secondMax && num[i] != firstMax){
                secondMax = num[i];
            }
            //còn nếu không thì nếu số đó lớn hơn secondmax và khác với firstmax
            //thì sẽ cập nhật số đó thành secondmax
        }
        //dưới đây là đoạn code để kiểm tra và in ra số secondmax
        if (secondMax != Integer.MIN_VALUE){
            System.out.println("The second largest number is" + secondMax);
        } else {
            System.out.println("There is no second largest number");
        }




    }
}
