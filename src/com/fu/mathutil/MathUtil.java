/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author lam.doan
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long result = Math.getFactorial(5);
        System.out.println("expected: 5! = 120; actual: " + result);
        System.out.println("expected: 6! = 720; actual: " + Math.getFactorial(6));
        System.out.println("expected: 0! = 1; actual: " + Math.getFactorial(0));
        //ki thuat kiem thu phan mem
        //uoc luong xem gia tri tra ve cua ham la gi
        //expected value 5! = 120
        //ham ai do viet khi chay thuc te la may
        //actual. gia su 120
        //if expected == actual, ham ngon trong tinh huong nay
//        Math.getFactorial(-5);
        
//Them code sau lan dau tien lam chuyen ay - code len server
//8;39 am 2/4/2025
        System.out.println("expected: 0! = 1; actual: " + Math.getFactorial(0));
        System.out.println("expected: 3! = 6; actual: " + Math.getFactorial(3));
    }
    
}
