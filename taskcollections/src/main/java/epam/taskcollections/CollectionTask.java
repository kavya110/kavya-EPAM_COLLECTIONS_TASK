package epam.taskcollections;
import java.util.List;
import java.util.Scanner;

interface openers
{
public void fetch(List<Integer> list);
public void append(List<Integer> list);
public void rem(List<Integer> list);
public void print(List<Integer> list);
}

public class CollectionTask implements openers
{
   
   public void fetch(List<Integer> list)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println( "Enter the index of the element to be fetched");
    int c = sc.nextInt();
    list.get(c);
    sc.close();
   }
   public void append(List<Integer> list)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println( "Enter the element to be added");
    int c = sc.nextInt();
    list.add(c);
    sc.close();
   }
   public void rem(List<Integer> list)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println( "Enter the element to be deleted");
    int c = sc.nextInt();
    list.remove(c);
    sc.close();
   }
   public void print(List<Integer> list)
   {
       for(Integer s:list)
        System.out.print(s+" ");
   }


}