package question;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

/**
 * @Author: yuanyuan.wang
 * @Date: 2019/6/12 11:03
 * @Description: 问题二
 */
public class QuestionTwo {

    public static void main(String[] args) {
        String[] text = initData();

        guiPrint(text);

        terminalPrint(text);
    }

    private static String[] initData() {
        String[] text = new String[]{"\"An", "information", "system", "(IS)", "is", "an", "organized", "system\"\n",
        "\"for", "the", "collection.", "organization,", "storage", "and\"\n", "\"communication", "of", "information.\"\n" };
        return text;

    }

    private static void terminalPrint(String[] texts) {

            String text = stream(texts).collect(Collectors.joining(" ", "[", "]" ));

         //String text = stream(texts).reduce(new StringBuilder(), (a,b) -> a.append(b).append(" "), (a, b) -> a.append(b)).toString();

//        StringBuilder sb = new StringBuilder();
//        for (String text : texts) {
//            sb.append(text).append(" ");
//        }
        System.out.println(text);
    }

    private static void guiPrint(String[] texts) {
        int gap = 10;
        JFrame f = new JFrame("LoL");
        f.setSize(410, 400);
        f.setLocation(200, 200);
        f.setLayout(null);



        JTextArea ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setBounds(gap, 10, 375, 380);

        for (String text : texts) {
            ta.append(text);
            ta.append(" ");
        }



        f.add(ta);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        f.setVisible(true);


    }

}
