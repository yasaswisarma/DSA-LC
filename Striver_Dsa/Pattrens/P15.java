package Pattrens;

import java.util.Scanner;

public class P15 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();
        char k;
        int j;
        for(int i=1;i<=n;i++){
            for(k='A', j=1;j<=i;j++){
                System.out.print(" "+k+" ");
                k++;
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
