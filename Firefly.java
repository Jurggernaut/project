package project;
import java.io.*;

public class Firefly {

	public static void main(String[] args) {
		int i;
		
		try {

			String content = "This is the content to write into file,";

			File file = new File("/Users/jathonsuen/filename.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for (i=0; i<9; i++){
				bw.write(content + i);
			}
			bw.close();

			System.out.println("Done");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


