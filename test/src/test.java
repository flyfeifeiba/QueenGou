import java.util.List;
import java.util.Map;

public class test {
    public static void main(String args[]){
        String str = "{\"couponList\":[4740002161,4740001895]}";
        List<Long> couponList = getCouponList(str);
    }

    /**
     * 获取优惠券id的list
     * @param awardInfo 奖品信息 {"couponList":[11111,2000,3000]}
     * @return
     */
    private List<Long> getCouponList(String awardInfo) {
        try {
            if (awardInfo == null) {
                return null;
            }
            Map<String, String> map = JSON.parseObject(awardInfo, new TypeReference<Map<String, String>>(){
            });
            List<Long> list = JSON.parseArray(map.get("couponList"), Long.class);
            return list;
        } catch (Exception e) {
            LOGGER.error("根据awardInfo获取优惠券/现金券ID异常:{}", e);
            return null;
        }
    }
}
