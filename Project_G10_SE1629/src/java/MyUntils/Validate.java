/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyUntils;

import java.util.Scanner;

/**
 *
 * @author NCC
 */
public class Validate {

    public boolean checkPassWord(String t) {
        /*
        Ít nhất một chữ cái viết hoa bằng tiếng Anh ,(?=.*?[A-Z])
        Ít nhất một chữ cái tiếng Anh viết thường,(?=.*?[a-z])
        Ít nhất một chữ số,(?=.*?[0-9])
        Ít nhất một ký tự đặc biệt,(?=.*?[#?!@$%^&*-])
        Chiều dài tối thiểu tám .{8,}
         */
        return t.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
    }

    public boolean checkInputStringNotEmail(String t) {
        return t.matches("[a-z 0-9]+");
    }

    public boolean checkInputStringEmail(String t) {
        return t.matches("^([\\w!#$%&'*+\\-/=?^_`{|}~]+\\.)*([\\w!#$%&'*+\\-/=?^_`{|}~]+)@[a-zA-Z0-9\\-]+(\\.[a-zA-Z0-9\\-]+)*$");
    }

    public boolean checkPhone(String t) {

        return t.matches("((^(\\+84|84|0|0084){1})(3|5|7|8|9))+([0-9]{8})");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "0858050379";
        Validate v = new Validate();
        int cou = 0;
        while (cou == 0) {
            System.out.println(v.checkPassWord(sc.nextLine()));
        }
    }

}
