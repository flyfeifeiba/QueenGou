import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        BufferedReader br = null;

        String line = "";
        String everyLine = "";
        try {

            Map<String, String> map = new HashMap<>();
            for (int i = 0 ;i<=15 ;i++) {
                br = new BufferedReader(new FileReader("D:\\cargouser\\cargo_user_"+i+".csv"));
                while ((line = br.readLine()) != null)  //读取到的内容给line变量
                {
                    String[] split = line.split(",");
                    String key = split[0];
                    map.put(key, "a");
                    
                }
            }
            System.out.println("csv表格中所有行数："+map.size());
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
