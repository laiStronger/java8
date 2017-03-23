/*
 * 文件名：fff.java
 * 版权：深圳柚安米科技有限公司版权所有
 * 修改人：laishaoqiang
 * 修改时间：2017年1月11日
 * 修改内容：新增
 */
package com.laisq;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;


public class ParallelArrays {
    public static void main(String[] args) {
        long[] arrayOfLong = new long[10];

        Arrays.parallelSetAll(arrayOfLong, index -> ThreadLocalRandom.current().nextInt(100));
        Arrays.stream(arrayOfLong).limit(10).forEach(i -> System.out.print(i + " "));
        System.out.println();

        Arrays.parallelSort(arrayOfLong);
        Arrays.stream(arrayOfLong).limit(10).forEach(i -> System.out.print(i + " "));
        System.out.println();
    }
}
