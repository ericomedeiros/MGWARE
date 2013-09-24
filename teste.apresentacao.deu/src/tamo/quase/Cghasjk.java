package tamo.quase;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Cghasjk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dt = new Date();
		SimpleDateFormat dtf = new SimpleDateFormat("kk:mm:ss dd/MM/YYYY");
		System.out.println(dtf.format(dt));

	}

}

