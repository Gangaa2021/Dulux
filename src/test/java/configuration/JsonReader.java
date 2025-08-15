package configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonReader {
    public static TestData getTestData() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            File file = new File("src/test/resources/testData.json");
            return mapper.readValue(file, TestData.class);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
