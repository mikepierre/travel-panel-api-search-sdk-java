package sdk.Helpers;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class QueryString {

  private String query;

  public QueryString(String name, String value) {
    encode(name, value);
  }

  public void add(String k, String value) {
    query += "&";
    encode(k, value);
  }

  private void encode(String name, String value) {
    try {
      query += URLEncoder.encode(name, "UTF-8");
      query += "=";
      query += URLEncoder.encode(value, "UTF-8");
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
      throw new RuntimeException("Broken VM does not support UTF-8");
    }

    }

    public String getQuery(){
      return query;
    }

    public String toString(){
      return getQuery();
    }


}