package com.yupi.usercenter.service;

import com.yupi.usercenter.model.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * 用户服务测试
 *
 * @author yupi
 */
@SpringBootTest
@Slf4j
public class UserServiceTest {

    @Resource
    private UserService userService;

}