package com.yupi.usercenter.job;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.usercenter.model.domain.User;
import com.yupi.usercenter.service.UserService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.yupi.usercenter.utils.RedisConstants.INDEX_PAGE_KEY;

@Slf4j
@Component
public class PreCacheJob {
/*    @Resource
    private UserService userService;

    @Resource
    private RedissonClient redissonClient;

    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    //重点用户
    private List<Long> mainUserList = Arrays.asList(1l);

 分布式锁
    @Scheduled(cron = "0 5 8 * * *")
    public void testWatchDog(){
        RLock lock = redissonClient.getLock("smile:index");
        try{
            //只有一个线程能获取到锁
            if (lock.tryLock(0,-1, TimeUnit.MILLISECONDS)){
                System.out.println("getLock: "+Thread.currentThread().getId());
            }
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }finally {
            //只能释放自己的锁
            if (lock.isHeldByCurrentThread()){
                System.out.println("unlock: "+Thread.currentThread().getId());
                lock.unlock();
            }
        }
    }

    public void doCacheRecommendUser(){
        for (Long userId: mainUserList){
            QueryWrapper<User> queryWrapper = new QueryWrapper<>();
            Page<User> userPage = userService.page(new Page<>(1, 20), queryWrapper);
            String redisKey = INDEX_PAGE_KEY +  userId;
            ValueOperations<String,Object> valueOperations = redisTemplate.opsForValue();
            //写缓存
            try {
                valueOperations.set(redisKey,userPage,30000, TimeUnit.MILLISECONDS);
            }catch (Exception e){
                log.error("redis set key error",e);
            }
        }
    }*/

}
