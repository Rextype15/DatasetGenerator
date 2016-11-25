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


        ObjectMapper mapper = new ObjectMapper();
        parser = mapper.readValue(new File("properties.json"), Parser.class);


        CSVGenerator.Generate(parser, file);

    }

}
