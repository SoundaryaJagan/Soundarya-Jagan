import java.util.*;
import java.lang.*;
import java.util.ArrayList;
public class rotat
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int k=s.nextInt();
ArrayList<Integer>a=new ArrayList<Integer>();
for(int i=0;i<n;i++)
{
int c=s.nextInt();
a.add(c);
}
Collection.rotate(a,k );
for(int d:a)
{
System.out.printf("%d ",d);
}
}
}
