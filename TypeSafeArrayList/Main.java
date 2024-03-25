package TypeSafeArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> citys = new ArrayList<String>();
        citys.add("istanbul");
        citys.add("izmir");
        citys.add("ankara");
        
        for (String city : citys) {
            System.out.println(city);
        }
        citys.remove("istanbul");
        Collections.sort(citys);
        for (String city : citys) {
            System.out.println(city);
        }
        
    }

}
