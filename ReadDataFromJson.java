package Utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromJson {
    public JSONObject staging_initiator;
    public JSONObject staging_reviewer;
    public JSONObject int_initiator;
    public JSONObject int_reviewer;
    WebDriver driver;
//    public ReadDataFromJson(WebDriver driver) {
//        this.driver = driver;
//    }
    public void json_reader() {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("TestData.json"));
            JSONObject jsonFileData = (JSONObject) obj;
            staging_initiator = (JSONObject) jsonFileData.get("staging_initiator");
            staging_reviewer = (JSONObject) jsonFileData.get("staging_reviewer");
            int_initiator = (JSONObject) jsonFileData.get("int_initiator");
            int_reviewer = (JSONObject) jsonFileData.get("int_reviewer");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
