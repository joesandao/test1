package test1;

import java.text.SimpleDataFormat;
import java.util.Calender;

public class Test1Control {
	Test1Model tm;
	
	Test1Control(){
		tm = new Test1Model();
	}
	
	public String getLog(String message) {
		Calender justNow = Calender.getInstance();
		SimpleDataFormat resDate = SimpleDataFormat("yyyy-MM-dd HH:mm:ss");
		String now = resDate.format(justNow.getTime());
		String result = tm.resultMsg(now + "::" + message);
		
		return result;
	}
}
