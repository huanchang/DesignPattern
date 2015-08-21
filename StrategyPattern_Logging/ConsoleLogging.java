import java.lang.String;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ConsoleLogging implements Logging{
	@Override
	public void info(String message){
		System.out.println(logPrefix("INFO")+message);
	}
	
	@Override
	public void info(String formatter, Object... args){
		info(String.format(formatter,args));
	}
	
	//TODO: Implement error and warn
	@Override
	public void warn(String message){
		System.out.println(logPrefix("WARN")+message);
	}
	
	@Override
	public void warn(String formatter, Object... args){
		info(String.format(formatter,args));
	}
	
	@Override
	public void error(String message){
		System.out.println(logPrefix("ERROR")+message);
	}
	
	@Override
	public void error(String formatter, Object... args){
		info(String.format(formatter,args));
	}
	
	private String logPrefix(String type){
		return String.format("%s[%s]\t",getCurrentTime(), type);
	}
	
	private String getCurrentTime(){
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss ");
		return ft.format(date);
	}
}