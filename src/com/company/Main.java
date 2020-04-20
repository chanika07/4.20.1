package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int w = sc.nextInt();
        int maxs =Integer.MIN_VALUE;
        int num=-1;
        for (int i=0;i<w;i++){
            int score = sc.nextInt();
            a[score-1]++;
        }
        for (int i=0;i<n;i++){
            if(a[i]>maxs){
                maxs=a[i];
                num=i;
            }
        }
        System.out.print(num+1+" "+maxs);
    }
}
