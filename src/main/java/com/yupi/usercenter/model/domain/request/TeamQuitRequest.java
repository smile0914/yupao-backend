package com.yupi.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class TeamQuitRequest implements Serializable {

    private Long teamId;

}
