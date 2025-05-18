package DataReader;

import Models.UserModel;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonReader {
   private ObjectMapper _objectMapper;
   private String _jsonPath;

   public JsonReader(String jsonPath){
       _objectMapper = new ObjectMapper();
       _jsonPath = jsonPath;
   }

   public UserModel getUserDataFromJson(String objectName) throws IOException {
       JsonNode jsonNode =  _objectMapper.readTree(new File(_jsonPath));
       jsonNode = jsonNode.get(objectName);
       return new UserModel(jsonNode.get("phoneNumber").asText() , jsonNode.get("password").asText() ,jsonNode.get("OTP").asText() );
   }
}
