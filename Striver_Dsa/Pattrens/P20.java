package Pattrens;

import java.util.Scanner;

public class P20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print("*");
            }
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(n-i);j++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=(n-i+1);j>=1;j--){
                System.out.print("*");
            }
            for(int j=2*(i-1);j>=1;j--){
                System.out.print(" ");
            }
            for(int j=(n-i+1);j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
