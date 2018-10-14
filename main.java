import java.util.*;

public class main{
public static void main(String[] args){
Scanner var = new Scanner(System.in);
System.out.print("Enter the number: ");
int n = var.nextInt();
int[] a = new int[n];
System.out.print("Enter the places: ");
for(int i=0;i<n;i++){
a[i] = var.nextInt();
}
map first = new map(a,n);
System.out.println("Successfull...\nfor showing kmap enter 1 below:");
int choice = var.nextInt();
for(;choice!=1;){
System.out.println("ERROR renter");
choice = var.nextInt();
first.show(choice);
}}}