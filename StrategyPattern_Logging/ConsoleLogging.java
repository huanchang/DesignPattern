import java.lang.String;

public class ConsoleLogging implements Logging{
	@Override
	public void info(String message){
		System.out.println(message);
	}
	
	@Override
	public void info(String formatter, Object... args){
		info(String.format(formatter,args));
	}
}