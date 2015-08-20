import java.lang.String;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class FileLogging implements Logging{
	private final File toWrite;
	
	public FileLogging(final File toWrite){
		this.toWrite = toWrite;
	}
	@Override
	public void info(String formatter, Object... args){
		info(String.format(formatter,args));
	}
	@Override
	public void info(String message){
		FileWriter fos=null;
		try{
			fos = new FileWriter(toWrite);
			fos.write(message);
		}catch(IOException e){
			System.out.println("IOException:"+e.getMessage());
			e.printStackTrace();
		}finally{
			try{
				if(fos!=null){
					fos.close();
				}
			}catch(IOException e){
				System.out.println("IOException:"+e.getMessage());
			}
		}
	}
}