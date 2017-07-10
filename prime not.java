# prime-not
import java.io.*;
import java.util.*;
public class prime not{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int k,count=0;
System.out.println("Enter the number");
k=sc.nextInt();
for(int i=2;i<k;i++){
if(k%2==0){
count ++;
break;
}
}
if(count == 0){
System.out.println("The number is prime");
}
else
System.out.println("The number is not a prime");
}
}
