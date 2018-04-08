package io.dk.dao;

import java.util.List;

import io.dk.entity.SysPermissionInit;

import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author DavidKing
 * @since 18/04/08 下午3:04.
 */
public interface SysPermissionInitMapper extends BaseMapper<SysPermissionInit> {

	List<SysPermissionInit> selectAll();

}
