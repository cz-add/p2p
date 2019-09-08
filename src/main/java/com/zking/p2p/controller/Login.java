package com.zking.p2p.controller;

import com.zking.p2p.model.Users;
import com.zking.p2p.service.IuserService;
import com.zking.p2p.util.HttpUtils;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
public class Login {
    @Autowired
    private IuserService iuserService;


    @RequestMapping("/main")
    @ResponseBody
    public static void main(String[] args,Users user) throws UnsupportedEncodingException {
        String host = "https://chanyoo.market.alicloudapi.com";
        String path = "/sendsms";
        String method = "GET";
        String appcode = "b5ff934543ca48b58e1218338ea2d793";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        System.out.println(user.getTel());
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("mobile", String.valueOf(user.getTel()));
        //随机数
        Random d = new Random();

        String str = "";

        for(int i=0;i<4;i++){

            int num = d.nextInt(10);

            str += num+"";
        }
        querys.put("content", "您的手机号："+String.valueOf(user.getTel())+"，验证码："+str+"，请及时完成验证，如不是本人操作请忽略。【阿里云市场】");

        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             */
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            System.out.println(response.toString());
            //获取response的body
//            System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
