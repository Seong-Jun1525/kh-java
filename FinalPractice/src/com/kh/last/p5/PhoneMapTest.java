package com.kh.last.p5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PhoneMapTest {

	public static void main(String[] args) {
		File file = new File("./phone.xml");
		Properties prop = new Properties();
		Map<String, Phone> map = new HashMap<String, Phone>();
		// Phone 객체를 3개 생성하여 맵에 모델을 key로 객체를 저장한다.
		// 맵에 저장된 객체 정보를 연속 출력 한다.– Map.EntrySet<String, Phone> 사용할 것
		
		Phone p1 = new Phone("galaxy S7", 563500, "삼성", 7);
		Phone p2 = new Phone("iphone 6s", 840000, "애플", 3);
		Phone p3 = new Phone("G5", 563500, "LG", 5);
		
		map.put(p1.getModel(), p1);
		map.put(p2.getModel(), p2);
		map.put(p3.getModel(), p3);
		
		Set<Entry<String, Phone>> entrySet = map.entrySet();
		
		Iterator<Entry<String, Phone>> entryIr = entrySet.iterator();
		
		System.out.println("맵에 저장된 정보는 다음과 같습니다.");
		while(entryIr.hasNext()) {
			Entry<String, Phone> entry = entryIr.next();
			String key = entry.getKey();
			Phone value = entry.getValue();
			
			System.out.println(key + " : " + value);
		}
		
		// 맵에 저장된 객체 정보를 Properties 를 사용해 “phone.xml” 파일에 기록 저장한다.
		
		for(String s : map.keySet()) {
			prop.setProperty(s, map.get(s).toString()); // map.put() 과 유사한 메서드
		}
		
		try {
			prop.storeToXML(new FileOutputStream(file), "Phone 정보");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
