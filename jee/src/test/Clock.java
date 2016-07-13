package test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @date     : 2016. 7. 13.
 * @author   : jun
 * @fileName : Clock.java
 * @story    :
 */

public class Clock {
	public String now(){
		return new SimpleDateFormat("HH:mm:ss").format(new Date());
	}
}
