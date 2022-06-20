package com.louis.mango.service;

import java.util.List;

import com.louis.mango.model.SysDept;
import com.louis.service.CurdService;

/**
 * 机构管理
 * @author Louis
 * @date Jan 13, 2019
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @param
	 * @return
	 */
	List<SysDept> findTree();
}
