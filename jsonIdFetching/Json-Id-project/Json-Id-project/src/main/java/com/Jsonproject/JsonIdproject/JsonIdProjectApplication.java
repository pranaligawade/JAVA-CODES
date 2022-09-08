package com.Jsonproject.JsonIdproject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
@SpringBootApplication
public class JsonIdProjectApplication {

    public static void main(String[] args) throws IOException, ParseException {
        ArrayList list = new ArrayList<>();
        JSONParser parser = new JSONParser();

        JSONObject object = (JSONObject) parser.parse(new FileReader("D:\\Json-Id-project\\Json-Id-project\\JsonFile.json"));

        String title = (String) object.get("title");
        System.out.println(title);
        Long item_id = (Long) object.get("item_id");

        System.out.println(item_id);
        JSONArray array = (JSONArray) object.get("children");
        System.out.println(array);

        list.add(item_id);

        JSONObject object1 = (JSONObject) array.get(0);
        list.add(object1.get("item_id"));

        JSONArray array1 = (JSONArray) object1.get("children");

        JSONObject object2 = (JSONObject) array1.get(0);
        list.add(object2.get("item_id"));

        JSONArray array3 = (JSONArray) object2.get("children");
        JSONObject object3 = (JSONObject) array3.get(0);
        list.add(object3.get("item_id"));
        JSONObject object4 = (JSONObject) array3.get(1);
        list.add(object4.get("item_id"));

        JSONObject object5 = (JSONObject) array1.get(1);
        list.add(object5.get("item_id"));

        System.out.println(list);
    }


}
//if(value instanceof JSONObject){
//            rjson(value);
//         }else
//       if(value instanceof  JSONArray){
//           for(){
//
//           }