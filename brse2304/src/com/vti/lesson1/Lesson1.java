package com.vti.lesson1;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        //toán tử cơ bản trong java
        //+,-,*,/ (chia lấy phần nguyên), % (chia lấy phần dư)
        int a = 3;
        int b = 2;
        int c = a + b;
        int d = a - b;
        int e = a / b;
        int f = a % b;
        int g = a * b;

        System.out.println("tổng 2 số là: " + c);
        System.out.println("hiệu 2 số là: " + d);
        System.out.println("thương 2 số là: " + e);
        System.out.println("chia 2 số lấy phần dư là: " + f);
        System.out.println("tích 2 số là: " + g);

        // toán tử gán
        // toán tử =
        int x1 = 654; //gán giá trị 645 cho x1

        //toán tử +=
        int x2 = 1;
        int x3 = 2;
        x2 += x3; //cộng 2 toán hạng rồi gán giá trị cho toán hạng bên trái
        //tương đương x2 = x2 + x3
        System.out.println("x2 bằng bao nhiêu? " + x2);

        //các phép toán sau tương tự
        x2 -= x3;
        x2 *= x3;
        x2 /= x3;
        x2 %= x3;

        //toán tử tiếp theo
        //dịch trái : <<=
        //dịch phải: >>=
        //phép and bit: &=
        //phép or loại trừ bit: ^=
        //phép ỏ bit: l=

        //toán tử logic
        //toán tử ==
        int s = 6;
        int p = 4;

        boolean check = true;
        check =  (s == p);
        System.out.println("check bằng gì đây: " + check);



    }
}
