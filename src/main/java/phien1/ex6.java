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
public class ex6 {
    boolean checkNguyenTo(int n){
  if(n<=2){
   return true;
  }else {
   for(int i =2;i<=Math.sqrt(n);i++){
    if(n % i == 0)
     return false;
   }
  }
  return true;
 }
 void inputNguyenTo(int n){
  for(int i = 1 ;i<n;i++){
   if(checkNguyenTo(i)){
    System.out.print(" " +i);
   }
  }
 }
   public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  ex6 lk = new ex6();
  int n = 28;
  System.out.println("Nhap n = \n");
  n = sc.nextInt();
  lk.inputNguyenTo(n);
   }
  }
