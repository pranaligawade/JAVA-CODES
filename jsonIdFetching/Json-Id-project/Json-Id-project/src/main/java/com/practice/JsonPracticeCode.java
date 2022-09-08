package com.practice;
import com.google.gson.JsonIOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Iterator;
import java.util.Set;


public class JsonPracticeCode {
    public  static  void gettingJsonId(JSONObject json) {
            Iterator<?> keys = ((JSONObject) json).keySet().iterator();
            while (keys.hasNext()) {
                String key = (String) keys.next();
                Object value= json.get(key);
                if (value  instanceof JSONObject) {
                    gettingJsonId(new JSONObject());
                       //value.(JSONObject);
                    }
                else if (value instanceof JSONArray) {
                    for (int i = 0; i < ((JSONArray) value).size(); i++) {
                        JSONObject a = (JSONObject) ((JSONArray) value).get(i);
                        gettingJsonId(a);
                }
                        System.out.println(key + "=" + json.get(key));
                }
            }
    }


    public static void main(String[] args) throws ParseException {
        String str="{\"title\": \"PARENT\",\n" + "\"item_id\": 1,\n" + "\"children\": [\n" + "{\n" + "\"title\": \"LEVEL 2\",\n" + "\"item_id\": 2,\n" + "\"children\": [\n" + "{\n" + "\"title\": \"LEVEL 3.1\",\n" + "\"item_id\": 3,\n" + "\"children\": [\n" + "{\n" + "\"title\": \"LEVEL 4.1\",\n" + "\"item_id\": 4\n" + "},\n" + "{\n" + "\"title\": \"LEVEL 4.2\",\n" + "\"item_id\": 5\n" + "}\n" + "]\n" + "},\n" + "{\n" + "\"title\": \"LEVEL 3.2\",\n" + "\"item_id\": 6\n" + "}\n" + "]\n" + "}\n" + "]\n" + "}";
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(str);
        try {
           gettingJsonId(json);
            System.out.println();

        }catch (JsonIOException e){
           e.printStackTrace();
        }
        }
    }
