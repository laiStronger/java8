/*
 * �ļ�����TestOptional.java
 * ��Ȩ�������ְ��׿Ƽ����޹�˾��Ȩ����
 * �޸��ˣ�laishaoqiang
 * �޸�ʱ�䣺2017��1��11��
 * �޸����ݣ�����
 */
package com.laisq;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * TODO ������һ�仰��������
 * <p>
 * TODO ��ϸ����
 * 
 * 
 * @author laishaoqiang
 * @since 2.2.4
 */
public class TestOptional {

    public static void main(String[] args) {
        Optional<String> fullName = Optional.ofNullable(null);
        System.out.println("Full Name is set? " + fullName.isPresent());
        System.out.println("Full Name: " + fullName.orElseGet(() -> "[none]"));
        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));

        System.out.println(fullName);
        
        
    }
}
