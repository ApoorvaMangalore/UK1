package workingWithExternalData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropFile {

	public static void main(String[] args) throws IOException {

		//step1:Create object for fis
		
		FileInputStream fis = new FileInputStream("./testData/data.properties");

		//step 2: Create object for prop files
		Properties prop = new Properties();

		// step 3: To read Data from prop
		prop.load(fis);

		//Print data
		System.out.println(prop.get("url"));
		System.out.println(prop.get("name"));
		System.out.println(prop.get("Company"));
		System.out.println(prop.get("Place"));
		
	}

}
