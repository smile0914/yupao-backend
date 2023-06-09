package com.yupi.usercenter.service;

import com.yupi.usercenter.model.domain.Team;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.usercenter.model.domain.User;
import com.yupi.usercenter.model.domain.request.TeamJoinRequest;
import com.yupi.usercenter.model.domain.request.TeamQuitRequest;
import com.yupi.usercenter.model.domain.request.TeamUpdateRequest;
import com.yupi.usercenter.model.dto.TeamQuery;
import com.yupi.usercenter.model.vo.TeamUserVO;

import java.util.List;

/**
* @author smile
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2023-05-28 16:46:43
*/
public interface TeamService extends IService<Team> {

    long addTeam(Team team, User loginUser);

    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    boolean updateTeam(TeamUpdateRequest teamUpdateRequest,User loginUser);

    boolean joinTeam(TeamJoinRequest teamJoinRequest,User loginUser);

    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    boolean deleteTeam(Long teamId, User loginUser);
}
