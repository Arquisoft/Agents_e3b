package asw.agents.util;

import java.util.Properties;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import com.opencsv.CSVReader;

public  class Utilidades {

	public static int getKindCode(String kind) {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
		Properties properties = new Properties();
		try(InputStream resourceStream = classLoader.getResourceAsStream("application.properties")) {
		    properties.load(resourceStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
        CSVReader csvReader = null;
        try {
        	csvReader = new CSVReader(new InputStreamReader(
        			classLoader.getResourceAsStream((properties.getProperty("csv.filepathname"))))
        	);
            String[] nextRow;
            while ((nextRow = csvReader.readNext()) != null) {
            	if(kind.equals(nextRow[1]))
        			return Integer.parseInt(nextRow[0]);
            }
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }        
        return -1;
	}	
}
