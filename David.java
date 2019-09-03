import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class David {

    public static void main(String[]args) throws Exception
    {
    Scanner sc = new Scanner(System.in);
    
    Date date = new Date();
    SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
    Calendar calendar = new GregorianCalendar();
    
    System.out.print("Input Date: ");
    String input_bday = sc.nextLine();
    Date bday = format.parse(input_bday);
    
    int year = calendar.get(Calendar.YEAR);
    calendar.setTime(bday);
    int byear = calendar.get(Calendar.YEAR);
    
    int age = year - byear;
    System.out.print("Age: " + age);	
    }
       
}