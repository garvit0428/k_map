import java.util.*;

public class map{
int []b;
int m;
public map(int[] c,int n){
this.m = n;
this.b = new int[n];
this.b = c;
}
public void k3(int y){
int i, j;
HashMap<Integer, String> plot = new HashMap<Integer, String>();
for(i=0;i<m;i++){
for(j=0;j<m;j++){
if(i==b[j]){
plot.put(i,"1");
}
else if(i!=b[j]){
plot.put(i,"0");
}}}
if(y==1){
for(j=0;j<8;j++){
System.out.println(" | "+plot.get(j)+" | ");
}}}
public void show(int l){
k3(l);
}}