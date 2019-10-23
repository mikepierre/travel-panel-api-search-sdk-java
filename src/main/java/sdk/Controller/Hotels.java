package sdk.Controller;

import java.io.IOException;
import java.util.HashMap;

import sdk.Helpers.CurlRequest;

public class Hotels {
    public String book(HashMap<String, String> data) {
        String response;
        CurlRequest curlRequest = new CurlRequest();
        try {
            response = curlRequest.sendRequest(data);
            return response;
        } catch (IOException e) {
             e.printStackTrace();
        }
        

        return null;
    }
    public String getExternalMarkets()
    {
        //
    }
    public String getIds(){}
    public String getImages(){}
    public String getProfileId(){}
    public String getRates(){}
    public String searchHotels(){}

}