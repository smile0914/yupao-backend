package com.yupi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class TeamJoinRequest  implements Serializable {
    /**
     * id
     */
    private Long teamId;
    /**
     * 密码
     */
    private String password;

}
