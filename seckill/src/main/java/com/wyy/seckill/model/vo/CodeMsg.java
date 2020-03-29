package com.wyy.seckill.model.vo;

import lombok.AllArgsConstructor;
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
@AllArgsConstructor
public class CodeMsg {

    private int code;
    private String msg;

    //通用异常

    public static CodeMsg SUCCESS = new CodeMsg(0, "success");
    public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常");

    //TODO其他异常

}
