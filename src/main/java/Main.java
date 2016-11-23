import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import java.io.*;

/**
 * Created by Emmanuel on 11/23/2016.
 */
public class Main {

    Parser parser;
    public static void main(String[] args) throws IOException {
        Parser parser = new Parser();
        String file = "properties.csv";

//        parser.properties = new JsonProp[2];
//        JsonProp tempProp = new JsonProp("House for Sale");
//        JsonProp jsonPropRent = new JsonProp("House for Rent");
//        LanguageProp languagePropSpanish = new LanguageProp();
//        LanguageProp languagePropEnglish = new LanguageProp();
//
//        languagePropEnglish.property = new String[]{"house","mansion"};
//        languagePropEnglish.operation = new String[]{"For sale", "Im selling"};
//
//
//        languagePropSpanish.property = new String[]{"casa","mansion"};
//        languagePropSpanish.operation = new String[]{"Se vende", "Vendo"};
//
//
//        tempProp.propertiesMap.put("en", languagePropEnglish);
//        tempProp.propertiesMap.put("es", languagePropSpanish);
//
//        parser.properties[0] = tempProp;
//        parser.properties[1] = jsonPropRent;
//
//
//        mapper.writeValue(new File("file.json"), parser);

        ObjectMapper mapper = new ObjectMapper();
        parser = mapper.readValue(new File("properties.json"), Parser.class);


        CSVGenerator.Generate(parser, file);

    }

    private static void GenerateCSV() {

    }


}
