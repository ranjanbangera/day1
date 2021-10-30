package multithreading;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Timerr implements Runnable {

	public static void main(String[] args) {
		Timerr t1 = new Timerr();
		Thread td1 = new Thread(t1);
		td1.start();
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			DateFormat date_format_obj = new SimpleDateFormat("HH:mm:ss");
			Date date_obj = new Date();
			System.out.println("current time : " + date_format_obj.format(date_obj));
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
			}
		}
	}

}
