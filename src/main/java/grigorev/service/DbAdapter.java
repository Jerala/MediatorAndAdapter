package grigorev.service;

import org.json.JSONObject;
import org.json.XML;

public class DbAdapter {

    private static int PRETTY_PRINT_INDENT_FACTOR = 4;

    private DbManager dbManager = new DbManager();

    public boolean insertXMLToMongoDB(String xmlText) {
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(xmlText);
            String jsonText = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            dbManager.insert(jsonText);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
