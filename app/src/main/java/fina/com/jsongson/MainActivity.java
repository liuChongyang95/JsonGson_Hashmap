package fina.com.jsongson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //xiaoA初始化
        Gson gson = new Gson();
        Studnt studnt = new Studnt();
        ArrayList<String> booklist = new ArrayList<>();
        booklist.add(0, "A");
        booklist.add(1, "B");
        booklist.add(2, "C");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("0", "A+");
        hashMap.put("1", "B+");
        hashMap.put("2", "C+");
        studnt.setAge(1);
        studnt.setBooks(booklist);
        studnt.setBooksMap(hashMap);
        studnt.setId(12345);
        studnt.setNickName("xiaoA");
        //生成json
        Log.d("TAG", gson.toJson(studnt));
        String result = gson.toJson(studnt);
        //gson解析json
        Studnt result2gson = gson.fromJson(result, Studnt.class);
        Log.d("TAG1", result2gson.nickName);
        HashMap<String, String> studnthashMap = gson.fromJson(gson.toJson(result2gson.booksMap), new TypeToken<HashMap<String, String>>() {
        }.getType());
        Log.d("???", gson.toJson(result2gson.booksMap));
        for (HashMap.Entry<String, String> a : studnthashMap.entrySet()) {
            Log.d("TAG2", a.getKey() + " " + a.getValue());
        }
        //泛型的hashmap
        HashMap<String, Studnt> num = new HashMap<>();
        num.put("boy", new Studnt("xiaoA1", 925));
        num.put("girl", new Studnt("xiaoA2", 430));
        //泛型hashmap转json
        String numjson = gson.toJson(num);
        Log.d("TAG3", numjson);
        //json解析
        HashMap<String, Studnt> numgson = gson.fromJson(numjson, new TypeToken<HashMap<String, Studnt>>() {
        }.getType());
        for (HashMap.Entry<String, Studnt> studnt1 : numgson.entrySet()) {
            Log.d("TAG4", studnt1.getKey() + " " + studnt1.getValue().toString());
        }
        hashMap.clear();
    }
}
