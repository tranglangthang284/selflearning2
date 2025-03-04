package com.udayan.oca;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Cau26 {
    public static void main(String[] args) {
        List<LocalDate> dates = new ArrayList<>();
        //khởi tạo 1 biến dates, dùng để lưu trữ các đối tượng có kiểu LocalDate
        // new ArrayList là cách để khởi tạo 1 đối tượng mới của lớp ArrayList


        dates.add(LocalDate.parse("2018-07-11"));
        dates.add(LocalDate.parse("1919-02-25"));
        //chuyển đổi chuỗi ngày tháng theo định dạng năm-tháng-ngày thành đối tường LocalDate


        dates.add(LocalDate.of(2020, 4, 8));
        dates.add(LocalDate.of(1980, Month.DECEMBER, 31));
        //phương thức này cho phép tạo 1 đối tượng LocalDate bằng cách chỉ định từng thành phần: ngày,tháng, năm

        dates.removeIf(x -> x.getYear() < 2000);

        System.out.println(dates);
    }
}
