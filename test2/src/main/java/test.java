import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class test {
    public static void main(String args[]){
        String str = "{\"couponId\":\"[111,222,333]\"}";

        List<Long> couponList = getCouponList(str);
        for (Long temp : couponList){
            System.out.println(temp);
        }
    }

    /**
     * 获取优惠券id的list
     * @param awardInfo 奖品信息 {"couponList":[11111,2000,3000]}
     * @return
     */
    private static List<Long> getCouponList(String awardInfo) {
        try {
            if (awardInfo == null) {
                return null;
            }
            Map<String, String> map = JSON.parseObject(awardInfo, new TypeReference<Map<String, String>>(){
            });
            List<Long> list = JSON.parseArray(map.get("couponId"), Long.class);
            return list;
        } catch (Exception e) {

            return null;
        }
    }
}
