package epam.taskcollections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.LogManager;
import java.util.logging.Logger;



/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	   {
	    int ch;
	    CollectionTask a =new CollectionTask();
	    Logger log = LogManager.getLogger(App.class);
	    List<Integer> obj = new LinkedList<Integer>();
	    obj.add(2);
	       obj.add(3);  
	       ((LinkedList<Integer>) obj).addFirst(1);
	       obj.add(4);
	       obj.add(5);
	       obj.add(6);
	       obj.add(7);
	       obj.add(8);
	       obj.add(9);
	       ((LinkedList<Integer>) obj).addLast(10);
	    Scanner sc=new Scanner(System.in);
	    do
	    {
	       System.out.println( "\nMenu for list operations:");
	       System.out.println( "1.Fetch an element");
	       System.out.println( "2.Add an element");
	       System.out.println( "3.Delete an element");
	       System.out.println( "4.Display the list");
	       System.out.println( "5.Exit");
	       System.out.println( "Enter your choice:");
	       ch=sc.nextInt();
	       
	       switch(ch)
	       {
	       case 1:a.fetch(obj);break;
	       case 2:a.append(obj);break;
	       case 3:a.rem(obj);break;
	       case 4:a.print(obj);break;
	       case 5:System.exit(0);
	       default:
	    	   log.error("Enter a Valid choice or exit");
	       }
	    }while(ch!=5);
	       sc.close();
	       
	       
	   }
}
