package com.kh.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapRun {
	
	/** Map<K, V>
	 * key - value 형식으로 데이터를 관리한다
	 * 	- key : 데이터의 중복을 허용하지 않는다 => Set 방식
	 * 	- value : key값이 중복되지 않은 경우, 중복이 허용됨 => List방식
	 * 	- key값이 동일할 경우 기존 데이터에 덮어씀
	 * 
	 * 메서드
	 * 	- put(key, value) : 데이터 추가
	 *  - remove(key) : 데이터 삭제
	 *  - get(key) : 데이터 조회
	 *  - keySet():Set : 키 목록 조회
	 *  - size() : 저장된 데이터 길이 조회
	 */

	public static void main(String[] args) {
		HashMap<Integer, String> hMap = new HashMap<>();
		
		hMap.put(1000, "HTML");
		hMap.put(1001, "CSS");
		hMap.put(1002, "JavaScript");
		hMap.put(1003, "Java");
		
		Set<Integer> keyList = hMap.keySet();
		
		System.out.println("-".repeat(30));
		for(Integer k : keyList) {
			System.out.println(k);
		}
		System.out.println("-".repeat(30));
		for(Integer k : keyList) {
			System.out.println(k + ": " + hMap.get(k));
		}
		System.out.println("-".repeat(30));
		
		// 세번째 데이터 삭제
		hMap.remove(1002);
		System.out.println("-".repeat(30));
		for(Integer k : keyList) {
			System.out.println(k + ": " + hMap.get(k));
		}
		System.out.println("-".repeat(30));
		
		Iterator<Integer> ir = keyList.iterator();
		
		while(ir.hasNext()) {
			int k = ir.next();
			System.out.println(k + " :: " +hMap.get(k));
		}
		System.out.println("-".repeat(30));
		
		// entrySet(): key-value 세트의 집합
		Set<Entry<Integer, String>> entrySet = hMap.entrySet();
		
		Iterator<Entry<Integer, String>> entryIr = entrySet.iterator();
		
		while(entryIr.hasNext()) {
			Entry<Integer, String> entry = entryIr.next();
			System.out.println(entry.getKey() + " ::: " + entry.getValue());
		}
	}

}
