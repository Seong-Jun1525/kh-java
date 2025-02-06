package com.kh.object.practice2.run;

import com.kh.object.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product pd = new Product();
		
		pd.setProductName("갤럭시북 프로2");
		pd.setPrice(1600000);
		pd.setBrand("삼성");
		
		pd.information();
	}

}
