package package01;

import java.util.Arrays;
public class BinarySearch{
public static int rank(int key,int []a){
int max=a.length-1;
int min=0;
int mid=(max+min)/2;
while(max>min){
if(a[mid]>key) mid=(min+mid)/2;
if(a[mid]<key) mid=(max+mid)/2;
else return mid;}
return -1;}
public static void main(String[] args){
int[]a={1,2,3,4,5,6,7,8,8};
int b=rank(5,a);
System.out.println(b+a[4]);
}}
