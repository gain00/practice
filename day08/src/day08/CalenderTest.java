package day08;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderTest {

		public static void main(String[] args) {
			Calendar now = Calendar.getInstance();
			
			
			int year  = now.get(Calendar.YEAR);
			int month  = now.get(Calendar.MONTH);
			int day = now.get(Calendar.DAY_OF_WEEK);
			int date = now.get(Calendar.DAY_OF_MONTH);
			String monthArray[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
			String dayArray[] = {"Sun","Mon","Tue","Wed","Thw,Fri,Sat"};
			
			int HourofDay = now.get(Calendar.HOUR_OF_DAY);
			int hour = now.get(Calendar.HOUR);
			int ampn = now.get(Calendar.AM_PM);
			
			int min = now.get(Calendar.MINUTE);
			int sec = now.get(Calendar.SECOND);
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/MM/dd - HH:MM:SS");
			System.out.println(dateFormat.format(now.getTime()));
			System.out.println(ampn==0? "오전":"오후"+-+hour+-+HourofDay+-+min+-+sec);
			
			System.out.println(year);
			if(month==0)return;
			
			System.out.println(year+"/"+monthArray[month]+"/"+date+"/"+dayArray[day-1]);
		
		}
}
