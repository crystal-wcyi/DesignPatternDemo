package com.demo.factory;

import com.demo.factory.itf.ISwordFactory;
import com.demo.factory.model.AbstractSword;
import com.demo.factory.model.object.QixingSword;

public class CaoCao implements ISwordFactory {

	@Override
	public AbstractSword creatSword() {
		return new QixingSword();
	}

}
