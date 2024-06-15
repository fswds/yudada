package com.wds.yudada.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wds.yudada.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

import javax.annotation.ManagedBean;

/**
 * 用户数据库操作
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




