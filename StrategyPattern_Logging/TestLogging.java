import java.io.File;

public class TestLogging{
	public static void main(String[] args){
		Logging log1 = new ConsoleLogging();
		Logging log2 = new FileLogging(new File("test.log"));
		log1.info("Hello, test console logging.%d.", 1);
		log2.info("Hello, test file logging.%d,%s",2,"Lalala");
	}
}