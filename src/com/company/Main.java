package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {

    public static void seqQ1() {
        Scanner input = new Scanner(System.in);
        int prevDay, num;
        int currentSeq=1, maxSeq=1;
        System.out.println("Enter number of numbers:");
        int numbers = input.nextInt();
        System.out.println("Enter number:");
        prevDay = input.nextInt();
        for (int i=1; i<numbers; i++) {
            System.out.println("Enter number:");
            num = input.nextInt();
            if (num>prevDay) {
                currentSeq++;
            } else {
                if (currentSeq>maxSeq) {
                    maxSeq = currentSeq;
                }
                currentSeq=1;
            }
            prevDay = num;
        }
        if (currentSeq>maxSeq) {
            maxSeq = currentSeq;
        }
        if (maxSeq==1) {
            System.out.println("There is no going up sequence !");
        } else {
            System.out.println("The longest sequence is : "+maxSeq);
        }
    }

    public static void seqQ2() {
        Scanner input = new Scanner(System.in);
        int num, dig1, dig2, currentDiff;
        int maxDiff=0, maxD1=0, maxD2=0;
        System.out.println("Enter number (2 digits):");
        num = input.nextInt();
        while(num>=10) {
            dig1 = num%10;
            dig2 = (num/10)%10;
            currentDiff = Math.abs(dig1-dig2);
            if(maxDiff<currentDiff) {
                maxDiff = currentDiff;
                maxD1 = dig1;
                maxD2 = dig2;
            }
            num = num/10;
        }
        System.out.println("Maximum difference is: "+maxDiff);
        System.out.println("between the numbers: "+maxD1+", "+maxD2);
    }

    public static void seqQ3() {
        Scanner input = new Scanner(System.in);
        int num, dig1, dig2, dig3;
        boolean foundHill = false;
        System.out.println("Enter number (3 digits):");
        num = input.nextInt();
        while(num>=100 && !foundHill) {
            dig1 = num%10;
            dig2 = (num/10)%10;
            dig3 = (num/100)%10;
            if(dig2>dig1&&dig2>dig3) {
                foundHill = true;
            }
            num = num/10;
        }
        if(foundHill)
            System.out.println("A hill number");
        else
            System.out.println("Not hill number");
    }


    public static void P2Q4() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = input.nextInt();
        for (int i=1; i<=num; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void P2Q5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = input.nextInt();
        for (int i=1; i<=num; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=num-1; i>0; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void P2Q6() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = input.nextInt();
        for (int i=num; i>=1; i--) {
            for (int j=i; j>=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i=2; i<=num; i++) {
            for (int j=i; j>=1; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void P4Q1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = input.nextInt();
        boolean primeNum = true;
        int k=2;
        while (k<=Math.sqrt(num) && primeNum) {
            if (num%k==0) {
                primeNum=false;
            }
            k++;
        }
        if (primeNum) {
            System.out.println("The number "+num+" is a prime number!");
        } else {
            System.out.println("The number "+num+" is not a prime number!");
        }
        for (int i=2; i<=100; i++) {
            primeNum=true;
            k=2;
            while (k<=Math.sqrt(i) && primeNum) {
                if (i%k==0) {
                    primeNum=false;
                }
                k++;
            }
            if (primeNum) {
                System.out.print(i+", ");
            }
        }
        System.out.println();
    }

    public static void P4Q2() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i*j==100) {
                    System.out.print(i*j+" ");
                } else if (i*j>9) {
                    System.out.print(i*j+"  ");
                } else {
                    System.out.print(i*j+"   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        seqQ1();
        seqQ2();
        seqQ3();
        P2Q4();
        P2Q5();
        P2Q6();
        P4Q1();
        P4Q2();
    }
}
