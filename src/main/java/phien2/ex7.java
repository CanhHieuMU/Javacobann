/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phien2;
import java.util.Scanner;
/**
 *
 * @author My PC
 */
public class ex7 {
    public static void main(String[] args) {
    int n, soDu, tong = 0;
    Scanner scanner = new Scanner(System.in);        
    System.out.println("Nhap vao so nguyen duong bat ky: ");
    n = scanner.nextInt();    
    while (n > 0) {
        soDu = n % 10;
        n = n / 10;
        tong += soDu;
    }     
    System.out.println("Tong cac chu so = " + tong);
    }       
}
