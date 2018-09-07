package com.cg.service;

import com.cg.bean.NumberBean;

public class AddServiceImpl implements IAddService {

	@Override
	public Integer add(NumberBean numberBean) throws NullPointerException {
		
		return (numberBean.getNum1()+numberBean.getNum2());
	}

	

}
