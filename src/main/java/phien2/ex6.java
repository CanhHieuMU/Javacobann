/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phien2;

/**
 *
 * @author My PC
 */
public class ex6 {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Liet ke tat ca so nguyen to co 5 chu so:");
        for (int i = 10001; i < 99999; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Tong cac so nguyen to co 5 chu so la: " + count);
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
