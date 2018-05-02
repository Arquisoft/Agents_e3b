package es.uniovi.asw.e3b.agents.util;

import com.opencsv.CSVReader;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStreamReader;


@Component
public class Utilidades {
	private static final Logger logger = Logger.getLogger(Utilidades.class);

	private static String csv_filepathname;
	
	// Hack to inject value into static variable
	// (yes, updating static non-final field from 
	// non-static method is asking for a problem...):
	@Value("${csv.filepathname:tipo_agentes.csv}") 
	public void setCsvFilepathname(String filepathname) {
		csv_filepathname = filepathname;
	}
	
	@Autowired
	public static int getKindCode(String kind) {	
		CSVReader csvReader = null;				
		logger.info("Search kindCode for kind '" + kind + "' on file '" + csv_filepathname + "'");
        try {        	
        	csvReader = new CSVReader(new InputStreamReader(new ClassPathResource(csv_filepathname).getInputStream()));
            String[] nextRow;
            while ((nextRow = csvReader.readNext()) != null) {
            	if(kind.equals(nextRow[1])) {
            		csvReader.close();
            		logger.info("Success on finding kindCode '" + nextRow[0] + "' for kind '" + kind + "' on file '" + csv_filepathname + "'");
        			return Integer.parseInt(nextRow[0]);
            	}
            }
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }         
        logger.error("There is not any kindCode for kind '" + kind + "' on file '" + csv_filepathname + "'");
        return -1;
	}	
}
