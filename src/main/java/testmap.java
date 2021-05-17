import java.util.HashMap;
import java.util.Map;

public class testmap {

    public static Map<String,String> mapShare(Map<String,String> mapValue){
        Map<String,String> newValue = new HashMap<>();
        if (mapValue.containsKey("a")){
            if (mapValue.containsKey("b")){
                mapValue.remove("c");
                mapValue.remove("d");
                mapValue.remove("e");
                mapValue.replace("b", String.valueOf(mapValue.get("a")));
                //newValue. = mapValue.keySet();
            }
        }
        return mapValue;
    }

    public static void main(String[] args) {
        Map<String,String> newValue = new HashMap<>();
        newValue.put("a","aaa");
        newValue.put("b","bbb");
        newValue.put("c","ccc");
        newValue.put("d","ddd");
        System.out.println(mapShare(newValue));
    }
}
