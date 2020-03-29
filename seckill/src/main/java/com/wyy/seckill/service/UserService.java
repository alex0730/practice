package com.wyy.seckill.service;

import com.wyy.seckill.model.bo.UserBo;
import com.wyy.seckill.model.vo.Result;

/**
 * <p> Description: [描述]</p>
 * Copyright (c) 2017年 北京柯莱特科技有限公司
 * Created on: 2020/3/29 16:41
 *
 * @author <a href="mailto: wuyingya@camelotchina.com">吴迎亚</a>
 * @version 1.0
 */
public interface UserService {

    Result<UserBo> getById(Integer userId);

}
