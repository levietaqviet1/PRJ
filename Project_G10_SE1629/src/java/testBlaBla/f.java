/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testBlaBla;

import java.util.Scanner;

/**
 *
 * @author NCC
 */
public class f implements cha{

    public static void main(String[] args) {
        int a = 5;
        int b=10;
        f a1 = new f();
        a1.a(a,b);
        System.out.println(a);
    }

    public void doi(int a) {
        a = 10;
    }

    @Override
    public void a(int a,int b) {
        int t =0;
        t = a;
        a=b;
        b=t;
    }
}
