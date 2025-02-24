package com.kh.review;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Lotto {

	public static void main(String[] args) {
		lotto();
	}
	
	public static void lotto() {
		int[] lottoArr = new int[6];
		HashSet<Integer> lottoSet = new HashSet<>();
		
//		for(int i = 0; i < 6; i++) {
//			int n = (int)(Math.random() * 45 + 1);
//			
//			if(!lottoSet.add(n)) {
//				i--;
//				continue;
//			}
//		}
		
//		for(; lottoSet.size() < 6;)
		while(lottoSet.size() < 6) {
			int n = (int)(Math.random() * 45 + 1);
			lottoSet.add(n);
		}
		
//		System.out.println(lottoSet.size());

		Iterator<Integer> ir = lottoSet.iterator();
		for(int i = 0; ir.hasNext(); i++) {
			lottoArr[i] = (int) ir.next();
		}
		
		System.out.println(Arrays.toString(lottoArr));
	}

}
