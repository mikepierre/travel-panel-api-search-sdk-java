package sdk.Controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

import org.omg.CORBA.portable.InputStream;
import org.yaml.snakeyaml.Yaml;

import sdk.Helpers.CurlRequest;

public class Hotels {
    
    public String book(HashMap<String, String> params) {
        String response;
        CurlRequest curlRequest = new CurlRequest();
        Map<String, Object> yaml = this.getYaml();
        String auth = (String) yaml.get("auth");
        String url = (String) yaml.get("hotels_book");

        try {
            response = curlRequest.sendRequest(data);
            return response;
        } catch (IOException e) {
             e.printStackTrace();
        }    

        return null;
    }
    public String getExternalMarkets(HashMap<String, String> data)
    {
        //
    }
    public String getIds(HashMap<String, String> data){}
    public String getImages(HashMap<String, String> data){}
    public String getProfileId(HashMap<String, String> data){}
    public String getRates(HashMap<String, String> data){}
    public String searchHotels(HashMap<String, String> data){}

    private Map<String, Object> getYaml()
    {
        Yaml yaml = new Yaml();
        InputStream inputStream = (InputStream) 
        this.getClass().getClassLoader().
        getResourceAsStream("../Controller/app.yaml");
        Map<String, Object> obj = yaml.load(inputStream);
        
        return obj;
    }

}