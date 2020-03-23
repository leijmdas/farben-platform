package com.farben.platform.domain;


import com.farben.platform.api.base.FarbenModel;

import java.io.Serializable;

;

/**
 * DictDataModel 数据字典
 * @author generator
 * @date 2020年02月20日
 */

public class DictDataModelBase extends FarbenModel implements Serializable {

	public SubsysDict getSubsysDict() {
		return subsysDict;
	}

	public void setSubsysDict(SubsysDict subsysDict) {
		this.subsysDict = subsysDict;
	}

	private SubsysDict subsysDict;

	private static final long serialVersionUID = 1L;

    // ==== 自定义属性 ====
}