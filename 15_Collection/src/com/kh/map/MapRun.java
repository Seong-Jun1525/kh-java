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
		/**
		 * Map의 key는 Set방식이므로 keySet()을 활용하여 Set 컬렉션에 저장할 수 있다.
		 * Set의 제네릭은 현재 hMap의 key값이 Integer로 저장되므로 Integer로 설정한다.
		 */

		// for each문을 활용하여 조회할 수 있다.
		System.out.println("-".repeat(30));
		for(Integer k : keyList) {
			System.out.println(k + ": " + hMap.get(k));
		}
		System.out.println("-".repeat(30));
		
		// 세번째 데이터 삭제
		hMap.remove(1002); // remove에 key값을 매개변수로 전달하여 해당 key값이 존재할 경우 삭제한다
		System.out.println("-".repeat(30));
		for(Integer k : keyList) {
			System.out.println(k + ": " + hMap.get(k));
		}
		System.out.println("-".repeat(30));
		
		Iterator<Integer> ir = keyList.iterator();
		/**
		 * Set은 순서가 없으로 get방식으로 데이터를 가져올 수 없다.
		 * Iterator(반복자)를 활용하여 가져올 수 있다.
		 * 
		 * Set 컬렉션 형태인 keyList에 iterator() 메서드를 호출하고
		 * 해당 값들은 Integer로 저장되어 있으므로 Iterator의 제네릭을 Integer로 설정한다.
		 */
		
		while(ir.hasNext()) {
			int k = ir.next();
			System.out.println(k + " :: " +hMap.get(k));
		}
		/**
		 * Iterator의 hasNext() 메서드는 다음 값이 존재하는지 안하는지에 대한 여부를 판단한다
		 * next() 메서드는 다음 값을 가져온다
		 */
		System.out.println("-".repeat(30));
		
		// entrySet(): key-value 세트의 집합
		Set<Entry<Integer, String>> entrySet = hMap.entrySet();
		/**
		 * Map은 key-value 형태로 저장되고 이런 key-value형태를 엔트리라고 한다.
		 * 
		 * 엔트리 자체를 Set 컬레션으로 만들 수 있는데 이때 Map의 entrySet() 메서드를 활용한다.
		 * 
		 * Set의 제네릭은 Entry형태로 설정한다
		 * 
		 * Entry는 Map 내에 있는 인터페이스이고 key-value 형태를 하는 하나의 객체를 얻을 수 있다.
		 * 
		 * Entry 제네릭은 당연히 key value에 맞게 둘다 설정해야한다.
		 */
		
		Iterator<Entry<Integer, String>> entryIr = entrySet.iterator();
		/**
		 * 엔트리를 Set 컬렉션으로 만들었으니 당연히 Iterator를 사용하여 데이터에 접근할 수 있다.
		 * 
		 * 이때 제네릭도 엔트리이므로 entrySet() 메서드를 사용하여 엔트리를 저장할 Set컬렉션을 만들때 설정한 제네릭과 동일하게 해줘야한다.
		 * 
		 * 마찬가지로 Set형태이므로 iterator() 메서드를 사용하여 만든다.
		 */
		
		while(entryIr.hasNext()) {
			Entry<Integer, String> entry = entryIr.next();
			/**
			 * Map 안에는 존재하는 Entry 인터페이스를 활용하여 key-value 형태의 하나의 객체로 얻을 수 있다.
			 * 
			 * 해당 객체로 key값과 value값을 호출할 수 있다.
			 */
			
			System.out.println(entry.getKey() + " ::: " + entry.getValue());
		}
	}

}
