
import java.io.FileWriter;
import java.io.IOException;


public class WriteFile {

	public static void main(String[] args) {
		FileWriter outputStream = null;
		try {
			outputStream = new FileWriter("Fred.txt");
			outputStream.write("Hello Fred\015\012");
			outputStream.write("Goodbye Fred.\007");

		} catch (IOException e) {

			e.printStackTrace();
		}
		finally{
			if(outputStream != null){
				try {
					outputStream.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}



	}

}
