package java.examples.pdf;

import java.io.IOException;

import com.testautomationguru.utility.PDFUtil;

public class PDFComparisonExample {

	public static void main(String args[]) {

		PDFUtil pdfUtilObj = new PDFUtil();

		try {

			Boolean booleanObj = pdfUtilObj.compare("C:/backup/example2.pdf", "C:/backup/example1.pdf");

			System.out.println("Output of Comparision : " + booleanObj);

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}