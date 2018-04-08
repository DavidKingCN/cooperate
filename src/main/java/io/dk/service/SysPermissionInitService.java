package io.dk.service;

import java.util.List;

import io.dk.dao.SysPermissionInitMapper;
import io.dk.entity.SysPermissionInit;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author DavidKing
 * @since 18/04/08 下午3:04.
 */
@Service
public class SysPermissionInitService extends ServiceImpl<SysPermissionInitMapper, SysPermissionInit>{
	
	public List<SysPermissionInit> selectAll() {
		return baseMapper.selectAll();
	}
}
