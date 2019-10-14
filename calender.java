import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Sol {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.next();
        int day = in.next();
        int year = in.next();
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        System.out.println(new DateFormatSymbols().getWeekdays().toUpperCase());

  in.close();  
        
    }
}

