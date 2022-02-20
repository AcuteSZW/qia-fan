package com.qiafan;


import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class JavaTest {
    @Test
    public void te(){
        String str = "[{\"f_message\":\"任务执行中\",\"update_time\":\"2021-04-15 10:48:41\",\"create_time\":\"2021-04-15 10:48:41\",\"f_status\":1,\"f_factory\":\"华为\",\"f_taskId\":11237412832256,\"f_deviceId\":33}]";
        str = str.substring(1,str.length()-1);
//        JsonObjec.parse
        JSONObject jsonObject = JSONObject.parseObject(str);
        System.out.println(jsonObject.get("f_message"));
        System.out.println("12123");
    }
}
