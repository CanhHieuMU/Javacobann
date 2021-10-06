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
public class ex8 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tim giai thua: ");
        number = scanner.nextInt();
        long fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        System.out.println("Giai thua cua "+number+" la: "+fact);
        System.out.println();
        System.out.println("----------------------------");
    }
}
