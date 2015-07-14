package sessionthree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogExceptions {
	// provide in property file
	static String filePath = "D:\\kalpana\\selenium\\logFile.txt";

	public static void main(String[] args) {
		handleException();
	}

	public static void handleException() {
		// Exception 1
		try {
			throw new IOException();
		} catch (IOException ie) {
			logExceptions(ie);
		}
		// Exception 2
		try {
			throw new NumberFormatException();
		} catch (NumberFormatException e) {
			// User manipulated message
			logExceptions("Number format error, verify the user input should be in digits");
		}
	}

	private static void logExceptions(String message) {
		try {
			FileWriter fw = new FileWriter(filePath, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(message);
			bw.flush();
			bw.close();
			fw.close();
		} catch (Exception exception) {
			throw new RuntimeException("Exception occured while writing to log file", exception);
		}
	}

	private static void logExceptions(Exception e) {
		try {
			FileWriter fstream = new FileWriter(filePath, true);
			BufferedWriter out = new BufferedWriter(fstream);
			PrintWriter pWriter = new PrintWriter(out, true);
			e.printStackTrace(pWriter);
		} catch (Exception exception) {
			throw new RuntimeException("Exception occured while writing to log file", exception);
		}

	}

}
