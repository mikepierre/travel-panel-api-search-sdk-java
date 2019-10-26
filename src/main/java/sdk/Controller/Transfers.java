package sdk.Controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import sdk.Helpers.CurlRequest;
import sdk.Helpers.QueryString;

public class Transfers {
/**
 * Book Transport Service
 * @param params
 * @return Json Data
 */
public String book(HashMap<String, String> params){

    String response;

    CurlRequest curlRequest = new CurlRequest();
    Map<String, Object> yaml = this.getYaml();
    String auth = (String) yaml.get("auth");
    String url = (String) yaml.get("attraction_tickets_book");

    QueryString qs = new QueryString("Authorization", auth);
    for(Map.Entry<String,String> entry : params.entrySet()){
        String K = entry.getKey();
        String V = entry.getValue();
        qs.add(K, V);
    }

    Map<String,String> data = new HashMap<String,String>();
    data.put("url", url);
    data.put("params",qs.toString());


    try {
        response = curlRequest.sendRequest(data);
        return response;
    } catch (IOException e) {
         e.printStackTrace();
    }    

    return null;
}
/**
 * Get Rates
 * @param params
 * @return Json Data
 */
public String getRates(HashMap<String, String> params){
    String response;

    CurlRequest curlRequest = new CurlRequest();
    Map<String, Object> yaml = this.getYaml();
    String auth = (String) yaml.get("auth");
    String url = (String) yaml.get("attraction_tickets_book");

    QueryString qs = new QueryString("Authorization", auth);
    for(Map.Entry<String,String> entry : params.entrySet()){
        String K = entry.getKey();
        String V = entry.getValue();
        qs.add(K, V);
    }

    Map<String,String> data = new HashMap<String,String>();
    data.put("url", url);
    data.put("params",qs.toString());


    try {
        response = curlRequest.sendRequest(data);
        return response;
    } catch (IOException e) {
         e.printStackTrace();
    }    

    return null;
}
    /**
     * Get YAML File
     * @param service - Get the yaml service file you are trying to call
     * @return Response Object
     */
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