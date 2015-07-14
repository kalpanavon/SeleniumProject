package sessionthree;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationProperties {
	static Properties properties = new Properties();

	public Properties getProperties() {
		if (properties != null && !properties.isEmpty()) {
			return properties;
		} else {
			try {
				initializeProperties();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return properties;
	}

	public void setProperties(Properties pros) {
		properties = pros;
	}

	public static void initializeProperties() throws IOException {
		//System.out.println(System.getProperty("user.dir"));
		FileInputStream fi = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\config\\application.properties");
		properties.load(fi);
	}

	public static void main(String[] args) throws IOException {
		initializeProperties();
		System.out.println(properties.get("filePath"));

	}

}
