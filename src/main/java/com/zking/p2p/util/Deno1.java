package com.zking.p2p.util;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Deno1 {
    public static void main(String[] args) {
        System.out.println(Locale.CHINA);
        System.out.println(Locale.US);
        String path="abc";
        ResourceBundle bundle = ResourceBundle.getBundle(path, Locale.CHINA);
        System.out.println(bundle);
        String name = bundle.getString("name");
        System.out.println(name);

        String msg = bundle.getString("msg");
        System.out.println(msg);
        msg=MessageFormat.format(msg,"张三","李四");
        System.out.println(msg);
    }
}
