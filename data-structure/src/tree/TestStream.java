package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/6/14 16:04
 * @Description: ${description}
 */
public class TestStream {

    public static void main(String[] args) {
        List<Studnet> studnetList = initData();
        Map<String, List<Studnet>> sss = studnetList.stream().collect(Collectors.groupingBy(Studnet::getName)).forEach({

        );


















    }

    private static List<Studnet> initData() {
        List<Studnet> studnetList = new ArrayList<>();
        Studnet studnet1 = new Studnet("A",100);
        Studnet studnet2 = new Studnet("A",100);
        Studnet studnet3 = new Studnet("A",100);
        Studnet studnet4 = new Studnet("A",100);
        Studnet studnet5 = new Studnet("A",100);
        Studnet studnet6 = new Studnet("A",100);
        Studnet studnet7 = new Studnet("A",100);
        studnetList.add(studnet1);
        studnetList.add(studnet2);
        studnetList.add(studnet3);
        studnetList.add(studnet4);
        studnetList.add(studnet5);
        studnetList.add(studnet6);
        studnetList.add(studnet7);
        return null;



    }

}
