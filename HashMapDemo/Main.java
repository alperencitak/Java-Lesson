package HashMapDemo;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> dict = new HashMap<String, String>();
        dict.put("important", "önemli");
        dict.put("tell", "anlatmak");
        dict.put("below", "asagida");
        dict.put("above", "yukarida");
        dict.remove("important");
        System.out.println(dict.size());
        System.out.println(dict);
        System.out.println("tell = " + dict.get("tell"));
        for (String item : dict.keySet()) {
            System.out.println(item + " = " + dict.get(item));
        }

    }

}
