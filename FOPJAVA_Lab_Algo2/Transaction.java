

package com.greatlearning.iitr.dsa.labsession2;




import java.util.Scanner;




class Transaction {

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of transaction array");

int size = sc.nextInt();

int arr[] = new int[size];

//int i;

System.out.println("Enter the values of array");

for(int i=0;   i<size;  i++) 
	
arr[i] = sc.nextInt();

System.out.println("Enter the total number of targets to be achieved");

int targetnumber = sc.nextInt();

while(targetnumber-- !=0) {

int flag = 0;

long target;

System.out.println("Enter the value of target");

target = sc.nextInt();

long sum = 0;

for (int i=0; i<size;i++) {

sum += arr[i];

if( sum >= target) {
System.out.println("Target achieved after " + (i + 1) + " transactions");

flag = 1;

break;

}

}

if (flag ==0) {


System.out.println("Sorry . Target not achieved");}
}
}
}

// TODO Auto-generated method stub







