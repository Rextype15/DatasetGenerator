import java.util.HashMap;

/**
 * Created by Emmanuel on 11/23/2016.
 */
public class JsonProp {
    public String classification;
    public HashMap<String,LanguageProp> propertiesMap;

    public JsonProp(){
        this.propertiesMap = new HashMap<String, LanguageProp>();
    }
}
