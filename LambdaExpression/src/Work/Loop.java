package Work;

import java.util.ArrayList;
import java.util.List;

public class Loop {
    public static void main(String[] args) {
        List<String> name=new ArrayList< String>();
        name.add("ayush");
        name.add("arpit");
        name.add("shivam");
        name.forEach(n-> System.out.println(n));
    }
}
