import java.util.HashMap;

public class test {

    public static void main(String[] args) {
        HashMap<String, Object> info = new HashMap<>();
        info = JsonUtil.readJsonString("{\"couponId\":\"2029\"}", HashMap.class);
    }

    private static Integer scopeExchange(Integer scope) {
        Integer result;
        if (scope == 1) {
            result = 2;
        } else if(scope == 2) {
            result = 3;
        } else {
            result = 4;
        }
        return result;
    }
}
