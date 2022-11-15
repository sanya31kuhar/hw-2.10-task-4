import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerString {

    Map<Integer, String> map;

    public IntegerString() {
        map = new LinkedHashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(i, "Строка " + i);
        }
    }

    public void print() {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey().toString() + ':' + entry.getValue());
        }
    }
}
