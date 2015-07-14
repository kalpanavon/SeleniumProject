package sessionthree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class FileUtil {
	// variable to load properties from file
	private static Properties properties = new Properties();

	public static void main(String[] args) {
		String filePath = System.getProperty("user.dir") + "\\src\\config\\app.properties";
		try {
			createFile(filePath);
			fileWriter(filePath);
			readKeys(new FileUtil().getProperties(filePath));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	// To create file
	public static void createFile(String filePath) throws IOException {
		File f = new File(filePath);
		f.createNewFile();
		System.out.println("File Created............");
	}
	// To write into the file
	public static void fileWriter(String filePath) throws IOException {
		FileWriter fw = new FileWriter(filePath);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("appName=Selenium Demo");
		bw.newLine();
		bw.write("appVersion=1.0");
		bw.flush();
		bw.close();
		fw.close();
		System.out.println("Content written on file............");
	}

	public Properties getProperties(String filePath) {
		if (properties != null && !properties.isEmpty()) {
			return properties;
		} else {
			try {
				initializeProperties(filePath);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return properties;
	}

	public void setProperties(Properties pros) {
		properties = pros;
	}

	private static void initializeProperties(String filePath) throws IOException {
		FileInputStream fi = new FileInputStream(filePath);
		properties.load(fi);
	}

	// To read values from file
	public static void readKeys(Properties appProperties) throws IOException {
		System.out.println("Reading keys from properties file..............");
		Enumeration<Object> keys= appProperties.keys();
		while(keys.hasMoreElements()){
			System.out.println(keys.nextElement());
		}
	}

}
