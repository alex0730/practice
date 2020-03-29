package com.wyy.seckill.service.Impl;

import com.wyy.seckill.dao.UserDao;
import com.wyy.seckill.model.bo.UserBo;
import com.wyy.seckill.model.dto.userDto;
import com.wyy.seckill.model.vo.Result;
import com.wyy.seckill.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p> Description: [描述]</p>
 * Copyright (c) 2017年 北京柯莱特科技有限公司
 * Created on: 2020/3/29 16:44
 *
 * @author <a href="mailto: wuyingya@camelotchina.com">吴迎亚</a>
 * @version 1.0
 */
@Service
public class UseServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UseServiceImpl.class);

    @Autowired
    UserDao userDao;

    @Override
    public Result<UserBo> getById(Integer userId) {
        UserBo bo = new UserBo();
        try {
            userDto userDto = userDao.getById(userId);
            bo.setId(userDto.getId());
            bo.setUseId(userDto.getUseId());
            bo.setUseName(userDto.getUseName());
//            bo.setId(1);
//            bo.setUseId(1);
//            bo.setUseName("测试一下");
        } catch (Exception e) {
            logger.error("查询用户信息异常：", e);
        }
        return Result.success(bo);
    }
}
