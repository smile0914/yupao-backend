package com.yupi.usercenter.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.usercenter.model.domain.UserTeam;
import com.yupi.usercenter.service.UserTeamService;
import com.yupi.usercenter.mapper.UserTeamMapper;
import org.springframework.stereotype.Service;

/**
* @author smile
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2023-05-28 16:47:35
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService{

}




