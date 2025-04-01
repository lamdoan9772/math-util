/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author lam.doan
 */
// we write classs to provide feature to another place use
//khi ta cung cap tien ich cho noi khac xai
//do la luc ta ko can nho cai gi
//cho rieng ta -> ham static giup lam dieu nay 
public class Math {
    
    //refractor???
    //n! = 1.2.3.4....n
    //0! = 1! = 1
    //ko tinh duoc giai thua cho so am
    // 20! la vua khop kieu long, kieu long toi da 18 con so 0
    //21! lo kieu long
    //neu dua vao am, 21! t ko tinh, 
    //ta xai mot ngoai le chui eo tinh
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument, n must be between 0 .. 20");
        //ham dung lien eo can return
        //xuong day la n = 0 .. 20
        if (n == 0 || n == 1)
            return 1;
        //dung ngay khi n dac biet
        //xuong day n = 2..20
        //choi for hoac de quy - recursion
        //ki thuat nhoi con heo dat, oc bu don thit
        //n = 2,3,4,5...20 nhoi lien tuc i vao tich
        long product = 1; //tich khoi dau = 1, 2,3,4
        for (int i = 2; i <= n; i++) {
            product *= i;//product dang co nhan con i dap nguoc tro lai product
//            product = product * i;
            //nhan tu tu 2 den
        }
        return product;
    }
    
    
}
