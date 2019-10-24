package sdk.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.omg.CORBA.portable.InputStream;
import org.yaml.snakeyaml.Yaml;

import sdk.Helpers.CurlRequest;
import sdk.Helpers.QueryString;

public class Hotels {
    /**
     * Book Hotel
     * @param params
     * @throws Expception...
     * @return JSON Response
     */
    public String book(HashMap<String, String> params) {

        String response;

        CurlRequest curlRequest = new CurlRequest();
        Map<String, Object> yaml = this.getYaml();
        String auth = (String) yaml.get("auth");
        String url = (String) yaml.get("hotels_book");

        QueryString qs = new QueryString("Authorization", auth);
        for(Map.Entry<String,String> entry : params.entrySet()){
            String K = entry.getKey();
            String V = entry.getValue();
            qs.add(K, V);
        }

        Map<String,String> data = new HashMap<String,String>();
        data.put("url", url);
        data.put("params",qs.toString());

        /* Java 8 for each to create params would work...
        params.forEach((k,v)->{
            qs.add(K, V);
        });*/

        try {
            response = curlRequest.sendRequest(data);
            return response;
        } catch (IOException e) {
             e.printStackTrace();
        }    

        return null;
    }
    /**
     * Book External Hotel Market Data.
     * @param params
     * @see api-docs
     * @throws Expception...
     * @return JSON Response
     */
    public String getExternalMarkets(HashMap<String, String> params){

        String response;

        CurlRequest curlRequest = new CurlRequest();
        Map<String, Object> yaml = this.getYaml();
        String auth = (String) yaml.get("auth");
        String url = (String) yaml.get("hotels_get_external_markets");

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
     * Get List of hotel Ids
     * @param params
     * @see api-docs
     * @throws Expception...
     * @return JSON Response
     */
    public String getIds(HashMap<String, String> params){

        String response;

        CurlRequest curlRequest = new CurlRequest();
        Map<String, Object> yaml = this.getYaml();
        String auth = (String) yaml.get("auth");
        String url = (String) yaml.get("hotels_get_ids");

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
     * Get Hotel Images.
     * @param params
     * @throws Expception...
     * @return JSON Response
     */
    public String getImages(HashMap<String, String> params){

        String response;

        CurlRequest curlRequest = new CurlRequest();
        Map<String, Object> yaml = this.getYaml();
        String auth = (String) yaml.get("auth");
        String url = (String) yaml.get("hotels_get_images");

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
     * Get Hotel Profiles by ID.
     * @param params
     * @throws Expception...
     * @return JSON Response
     */
    public String getProfileId(HashMap<String, String> params){

        String response;

        CurlRequest curlRequest = new CurlRequest();
        Map<String, Object> yaml = this.getYaml();
        String auth = (String) yaml.get("auth");
        String url = (String) yaml.get("hotels_get_profile_by_id");

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
     * Get locations.
     * @param params
     * @throws Expception...
     * @return JSON Response
     */
    public String getLocations(HashMap<String, String> params){

        String response;

        CurlRequest curlRequest = new CurlRequest();
        Map<String, Object> yaml = this.getYaml();
        String auth = (String) yaml.get("auth");
        String url = (String) yaml.get("hotels_get_locations");

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
     * Get list of hotel rates.
     * @param params
     * @throws Expception...
     * @return JSON Response
     */
    public String getRates(HashMap<String, String> params){

        String response;

        CurlRequest curlRequest = new CurlRequest();
        Map<String, Object> yaml = this.getYaml();
        String auth = (String) yaml.get("auth");
        String url = (String) yaml.get("hotels_get_rates");

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
     * Get list of hotels.
     * @param params
     * @throws Expception...
     * @return JSON Response
     */
    public String searchHotels(HashMap<String, String> params){

        String response;

        CurlRequest curlRequest = new CurlRequest();
        Map<String, Object> yaml = this.getYaml();
        String auth = (String) yaml.get("auth");
        String url = (String) yaml.get("hotels_search");

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