package hw43;
import java.util.Date;

public class MainClass {

	public static void main(String[] args) {
		
		
		while(true) {
			
			Date date = new Date();
			System.out.print("\r                                            ");
			System.out.print("\r");
			System.out.printf("Date: %ta %<te %<tb %<tY; Time: H:%<tH M:%<tM S:%<tS", date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
