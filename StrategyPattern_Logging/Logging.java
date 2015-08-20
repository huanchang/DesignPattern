public interface Logging{
	public void info(String format, Object... args);
	public void info(String message);
	public void error(String message);
	public void error(String format, Object... args);
	public void warn(String message);
	public void warn(String format, Object... args);
}
