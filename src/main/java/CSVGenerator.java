/**
 * Created by Emmanuel on 11/23/2016.
 */

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVGenerator {


    public static Boolean Generate(Parser parser, String file) throws IOException {


        CSVWriter writer = new CSVWriter(new FileWriter(file));

        for(JsonProp property: parser.properties){
            for(LanguageProp lp: property.propertiesMap.values()){
                for (String prop: lp.property){
                    for (String oper: lp.operation){

                        //Write the record to file
                        String [] record = String.format("%s %s,%s", prop, oper, property.classification).split(",");
                        writer.writeNext(record);

                        //Write the record backwards to file
                        record = String.format("%s %s,%s", prop, oper, property.classification).split(",");
                        writer.writeNext(record);

                    }
                }
            }
        }

        //close the writer
        writer.close();

        return true;
    }
}
