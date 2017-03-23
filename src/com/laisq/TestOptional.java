/*
 * 文件名：TestOptional.java
 * 版权：深圳柚安米科技有限公司版权所有
 * 修改人：laishaoqiang
 * 修改时间：2017年1月11日
 * 修改内容：新增
 */
package com.laisq;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * TODO 添加类的一句话简单描述。
 * <p>
 * TODO 详细描述
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
