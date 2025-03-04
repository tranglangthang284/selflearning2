package com.udayan.oca;

class Student {
    String name;
    int marks;
//Lớp Student được định nghĩa với 2 thuộc tính: String name (lưu tên sv) và int marks (lưu điểm)

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        //tạo 1 constructor, contructor có cùng tên với lớp và k có kiểu trả về
        //tham số của constructor này là: String name và int marks
        //từ khóa this tham chiếu đến 1 đối tượng hiện tại đang được khởi tạo
        //khi viét this.name thì muốn truy cập đến thuộc tính name của đối tượng hiện tại chứ kp tham sô name được truyền vào constructor
        //dòng này dùng để gắn giá trị của tham số name cho thuộc tính name của đối tượng
    }
}


public class Cau27 {
    public static void main(String[] args) {
        Student student = new Student("James", 25);
        //lúc này constructor sẽ được gọi
        //1.gọi 1 đối tượng mới từ lớp Student
        //2.gọi constructor student (string name, int marks) và truyền vào "James" và 25

        int marks = 25;
        //khai báo 1 biến nguyên thủy marks với giá trị 25


        review (student, marks);
        //gọi phương thức review, truyền vào đối tượng student, marks
        System.out.println(marks + "-" + student.marks);
    }

    private static void review(Student stud, int marks) {
        marks = marks + 10;
        stud.marks+=marks;
    }
}
