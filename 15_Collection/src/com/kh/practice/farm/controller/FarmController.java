package com.kh.practice.farm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.kh.practice.farm.model.vo.Farm;

public class FarmController {
	// 마트에서 농산물 저장용 HashMap 객체 생성(hMap)
	// 고객이 구매한 농산물 저장용 ArrayList 객체 생성(list)
	HashMap<Farm, Integer> hMap = new HashMap<>();
	ArrayList<Farm> list = new ArrayList<>();
	
	public boolean addNewKind(Farm f, int amount){
		// 전달 받은 f가 hMap 안에 key로 존재하지 않을 때
		// f와 amount를 각각 키와 값으로 저장 후 true 반환, 존재할 경우 false 반환.
		Set<Farm> key = hMap.keySet();
		
		Iterator<Farm> ir = key.iterator();
		while(ir.hasNext()) {
			if(ir.next().equals(f)) {
				return false;
			}
		}
		
		hMap.put(f, amount);
		
		return true;
	}
	public boolean removeKind(Farm f){
		// 전달 받은 f가 hMap 안에 key로 존재할 때 hMap에 f 삭제 후 true 반환
		// 존재하지 않을 경우 false 반환
		Set<Farm> key = hMap.keySet();
		
		Iterator<Farm> ir = key.iterator();
		while(ir.hasNext()) {
			if(ir.next().equals(f)) {
				hMap.remove(f);
				return true;
			}
		}
		
		return false;
	}
	public boolean changeAmount(Farm f, int amount){
		// 전달 받은 f가 hMap 안에 key로 존재할 때 f와 amount 저장 후 true 반환
		// 존재하지 않을 경우 false 반환
		Set<Farm> key = hMap.keySet();
		
		Iterator<Farm> ir = key.iterator();
		while(ir.hasNext()) {
			if(ir.next().equals(f)) {
				removeKind(f);
				addNewKind(f, amount);
				return true;
			}
		}
		
		return false;
	}
	public HashMap<Farm, Integer> printFarm() {
		// 농산물 데이터가 들어가있는 컬렉션 반환
		return hMap;
	}
	public boolean buyFarm(Farm f){
		// 전달 받은 f가 hMap 안에 존재하면서 그 f의 수량이 0개 이상일 때
		// list에 f 추가, 그리고 hMap에 f의 수량 1 감소 후 true 반환
		// 존재하지 않으면 false 반환
		Set<Farm> key = hMap.keySet();
		
		Iterator<Farm> ir = key.iterator();
		while(ir.hasNext()) {
			Farm ff = ir.next();
			if(ff.equals(f) && hMap.get(ff) >= 0) {
				list.add(f);
				Integer n = hMap.get(ff);
				hMap.put(ff, --n);
				return true;
			}
		}
		
		return false;
	}
	public boolean removeFarm(Farm f){
		// 전달 받은 f가 list에 존재할 때 list에 f 삭제, 그리고 hMap에 f 수량 1 증가
		// 위 경우일 때 true 반환, 아니면 false 반환
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(f)) {
				list.remove(i);
				Integer n = hMap.get(f);
				hMap.put(f, ++n);
				return true;
			}
		}
		
		return false;
	}
	public ArrayList<Farm> printBuyFarm(){
		// 농산물 구매 데이터가 들어가있는 컬렉션 반환
		return list;
	}
}
