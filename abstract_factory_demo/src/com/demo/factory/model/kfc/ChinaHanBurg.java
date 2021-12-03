package com.demo.factory.model.kfc;

import com.demo.factory.model.Hamburg;

//中国风味的麻辣鸡腿汉堡
public class ChinaHanBurg extends Hamburg {

	public ChinaHanBurg(int num) {
		this.kind = "麻辣";
		this.price = 14.0f;
		this.num = num;
	}

}
