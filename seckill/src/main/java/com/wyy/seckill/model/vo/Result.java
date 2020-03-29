package com.wyy.seckill.model.vo;

import lombok.Data;

/**
 * <p> Description: [描述]</p>
 * Copyright (c) 2017年 北京柯莱特科技有限公司
 * Created on: 2020/3/29 16:20
 *
 * @author <a href="mailto: wuyingya@camelotchina.com">吴迎亚</a>
 * @version 1.0
 */
@Data
public class Result<T> {

    private int code;
    private String msg;
    private T data;

    /**
     * 成功时的调用
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>(data);
    }

    /**
     * 失败时候的调用
     *
     * @param cm
     * @param <T>
     * @return
     */
    public static <T> Result<T> error(CodeMsg cm) {
        return new Result<T>(cm);
    }

    public Result(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    public Result(CodeMsg cm) {
        if (cm == null) {
            return;
        }
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }
}

