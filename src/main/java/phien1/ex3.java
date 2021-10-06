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
public class ex3 {
    public static void main(String[] args){
        int d,s=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        d = input.nextInt();
        for(int i=0;i<=d;i++){
            s+=i;
        }
        System.out.println(s);  
    }
}