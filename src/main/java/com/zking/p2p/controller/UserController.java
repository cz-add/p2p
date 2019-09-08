package com.zking.p2p.controller;

import com.aliyun.oss.OSSClient;
import com.zking.p2p.model.Users;
import com.zking.p2p.service.IuserService;
import com.zking.p2p.shiro.PasswordHelper;
import com.zking.p2p.util.AliyunOSSClientUtil;
import com.zking.p2p.util.HttpUtils;
import com.zking.p2p.util.JsonData;
import com.zking.p2p.util.PageBean;
import net.sf.json.JSON;
import org.apache.http.HttpResponse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IuserService iuserService;




    @RequestMapping("/login")
    @ResponseBody
    public JsonData login( Users user) {
        Users u = iuserService.doLogin(user);
        String message=null;

        if (null == u || !PasswordHelper.checkCredentials(user.getPassword(), u.getSalt(), u.getPassword())) {

            message = "帐号或密码错误";
        } else if (new Integer(1).equals(u.getLocked())) {
            message = "帐号已锁定，请与管理员联系";
        }
        JsonData jsonData=new JsonData();
        jsonData.setResult(u);
        jsonData.setMessage(message);
        return  jsonData;
    }
    private String yzm = null;
    @RequestMapping("/zc")
    @ResponseBody
    public JsonData zc( Users user) {
        int i = iuserService.doRegister(user);
        JsonData jsonData=new JsonData();
        jsonData.setResult(i);
        return  jsonData;
    }
//    public JsonData cz(Users users){
//        JsonData jsonData=new JsonData();
//        if(users.getYoyzm().equals(yzm)){
//            System.out.println("进来了》》》》》");
//            iuserService.doRegister(users);
//            jsonData.setCode(0);
//            jsonData.setMessage("注册成功");
//            return jsonData;
//        }else{
//            System.out.println(users.getYoyzm());
//            jsonData.setCode(1);
//            jsonData.setMessage("注册失败！！！");
//            return jsonData;
//        }
//    }


    @RequestMapping("/list")
    @ResponseBody
    public JsonData list( Users user,PageBean pageBean) {
        List<Users> list = iuserService.list(user,pageBean);
        JsonData jsonData=new JsonData();
        jsonData.setResult(list);
        jsonData.setRows(pageBean.getRows());
        jsonData.setPage(pageBean.getPage());
        jsonData.setTotal(pageBean.getTotal());
        System.out.println(jsonData);

        return  jsonData;
    }
    @RequestMapping("/upjy")
    @ResponseBody
    public JsonData upjy( Users user) {
        int upjy = iuserService.upjy(user);
        JsonData jsonData=new JsonData();
        jsonData.setResult(upjy);

        System.out.println(jsonData);

        return  jsonData;
    }


    //验证码
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

    //身份证
    @RequestMapping("/sfz")
    @ResponseBody

    public static void sfz(String[] args) {
        String host = "https://idcert.market.alicloudapi.com";
        String path = "/idcard";
        String method = "GET";
        String appcode = "5131c118cd1842bf9232a4a18a9dbf85";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("idCard", "431121200005280799");
        querys.put("name", "邓志强");
        //JDK 1.8示例代码请在这里下载：  http://code.fegine.com/java/cmapi022049.zip


        try {
            /**
             * 重要提示如下:
             * HttpUtils请从
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
             * 或者直接下载：
             * http://code.fegine.com/HttpUtils.zip
             * 下载
             *
             * 相应的依赖请参照
             * https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
             * 相关jar包（非pom）直接下载：
             * http://code.fegine.com/aliyun-jar.zip
             */
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            //System.out.println(response.toString());如不输出json, 请打开这行代码，打印调试头部状态码。
            //状态码: 200 正常；400 URL无效；401 appCode错误； 403 次数用完； 500 API网管错误
            //获取response的body
//            System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
