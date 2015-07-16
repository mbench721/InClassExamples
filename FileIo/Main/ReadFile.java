
import java.io.FileReader;
import java.io.IOException;


public class ReadFile {

	public static void main(String[] args) {
		FileReader reader = null;
		try {
			 reader = new FileReader("Fred.txt");
			 for(;;){
				 int c = reader.read();
				 if(c == -1) break;
				 System.out.print((char)c);
			 }
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally{
			if(reader != null){
				try {
					reader.close();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
		}

	}

}
