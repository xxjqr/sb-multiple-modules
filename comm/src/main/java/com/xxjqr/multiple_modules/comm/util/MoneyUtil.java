package com.xxjqr.multiple_modules.comm.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by xxjqr on 2017/9/16.
 */
public class MoneyUtil {
    public final static Integer y = 0; //23
    public final static Integer j = 1; //需要移动一位 23.2
    public final static Integer f = 2; //23.23

    public final static String yStr = "0";
    public final static String jStr = "1";
    public final static String fStr = "2";

    public static String formatMoney(Integer money,Integer type,Integer offset){
        //转成字符串
        String moneyStr = String.valueOf(money);
        Integer length = moneyStr.length();
        String jf = "";
        StringBuilder sb = new StringBuilder();
        if (length>type){ //表示>1000
            jf = moneyStr.substring(length-type,length);
            List<String> rmb = new ArrayList<>();
            moneyStr = moneyStr.substring(0,length-type);    //先把角分去掉

            length = moneyStr.length();
            while (length>3){
                rmb.add(moneyStr.substring(length-3));
                moneyStr = moneyStr.substring(0,length-3);    //把添加到列表的内容去掉
                length = moneyStr.length();
            }
            if (length>0) {
                rmb.add(moneyStr);
            }
            Collections.reverse(rmb);//把列表反转
            for (String tmp:rmb){
                sb.append(tmp).append(",");
            }
            return sb.toString().substring(0,sb.length()-1)+"."+getOffsetNumber(jf,offset,type);
        }
        else
            return "0."+getOffsetNumber(moneyStr,offset,type);
    }

    private static String getOffsetNumber(String money,Integer offset,Integer type){
        if (money.length()>=offset)
            return money.substring(0,offset);

        Integer num = offset-money.length();

        StringBuilder sb = new StringBuilder();


        for (Integer i=0;i<num;i++){
            sb.append("0");
        }

        //角，把值加在最前面
        if (type==MoneyUtil.j) return money+sb.toString();

        //分，元 把值加到最后（元传进来的money肯定是0）
        return sb.append(money).toString();
    }
}
