/*
 * �ļ�����Base64s.java
 * ��Ȩ�������ְ��׿Ƽ����޹�˾��Ȩ����
 * �޸��ˣ�laishaoqiang
 * �޸�ʱ�䣺2017��1��11��
 * �޸����ݣ�����
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