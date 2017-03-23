/*
 * 文件名：Base64s.java
 * 版权：深圳柚安米科技有限公司版权所有
 * 修改人：laishaoqiang
 * 修改时间：2017年1月11日
 * 修改内容：新增
 */
package com.laisq;

import java.nio.charset.StandardCharsets;
import java.util.Base64;


public class Base64s {
    public static void main(String[] args) {
        final String text = "Base64 finally in Java 8!?id=1";

        final String encoded = Base64.getEncoder().encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println(encoded);

        final String decoded = new String(Base64.getDecoder().decode(encoded), StandardCharsets.UTF_8);
        System.out.println(decoded);
    }
}