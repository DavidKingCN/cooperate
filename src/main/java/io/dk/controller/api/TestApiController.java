package io.dk.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import io.dk.service.RedisService;

/**
 * <p>
 *  api控制器
 * </p>
 *
 * @author DavidKing
 * @since 18/04/08 下午3:04.
 */
@RestController
@RequestMapping("/api/test")
public class TestApiController {
	
	@Autowired
	RedisService redisService;
	
	@RequestMapping("/test1")
	public String view() {
		return JSON.toJSONString(redisService.getRedisInfo());
    }
}
