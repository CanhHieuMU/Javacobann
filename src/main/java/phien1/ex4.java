/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phien1;
import java.util.Scanner;
/**
 *
 * @author My PC
 */
public class ex4 {
    public static void main(String[] args){
        int a, count = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap vao 1 so nguyen duong bat ky: ");
            a = scanner.nextInt();
            while (a <= 0) {
                System.out.println("So nhap vao phai lon hơn 0. Moi ban nhap lai: ");
                a = scanner.nextInt();
            }
            while (a > 0) {
                a /= 10;
                count++;    
            }
            System.out.println("So cac chu so = " + count);
    }
}
