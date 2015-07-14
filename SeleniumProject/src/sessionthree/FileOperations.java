package sessionthree;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
	static String filePath="D:\\kalpana\\selenium\\newFile.txt";

	public static void main(String[] args) {
		File f = new File(filePath);
		try {
			f.createNewFile();
			writeToFile();
			readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void writeToFile() throws IOException{
		FileWriter fw = new FileWriter(filePath);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Wrote something in file pleasecheck");
		bw.flush();
		bw.close();
	}
	public static void readFile() throws IOException{
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		String fileContent = "";
		while((fileContent=br.readLine()) != null){
			System.out.println(fileContent);
		}
		br.close();
	}

}
