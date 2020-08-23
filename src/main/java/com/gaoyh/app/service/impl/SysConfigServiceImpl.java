/**
 * 
 */
package com.gaoyh.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaoyh.app.domain.SysConfig;
import com.gaoyh.app.mapper.SysConfigMapper;
import com.gaoyh.app.service.SysConfigService;

/**
 * @author gaoyh
 *
 */
@Service
public class SysConfigServiceImpl implements SysConfigService {
	@Autowired
	SysConfigMapper sysConfigMapper;
	
	@Override
	public List<SysConfig> selectAll() {
		return sysConfigMapper.selectAll();
	}

}
