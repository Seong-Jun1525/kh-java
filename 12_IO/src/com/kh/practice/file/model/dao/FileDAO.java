package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	// 생성자를 통해 특정 경로에 폴더가 없을 경우 폴더 생성
	String path = "./resources/files";
	
	public FileDAO() {
		File folder = new File(path);
		
		if(!folder.exists()) {
			if(folder.mkdirs()) {
				System.out.println("[ERROR] 폴더 생성 실패");
			}
		}
	}
	
	// new File(상위폴더경로, 파일명)
	// path: 상위폴더. 상위폴더를 함께 전달하면 상위폴더에 파일을 생성하겠다는 의미

	public boolean checkName(String file) {
		// File 객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌
		// 해당 파일이 있는지 없는지에 대한 boolean 값을 반환
		return new File(path, file).exists();
	}
	
	public void fileSave(String file, String s) {
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 만들어주고
		// String에 써서 저장
		
		File f = new File(path, file);
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
			bw.write(s);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String fileOpen(String file) {
		// 매개변수로 들어온 file로 파일을 찾아 String에 값들 저장하여 반환
		String result = "";
		String data = "";
		File f = new File(path, file);
		try(BufferedReader br = new BufferedReader(new FileReader(f))) {
			while((data = br.readLine()) != null) {
				result += (data + "\n");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public void fileEdit(String file, String s) {
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 찾고
		// String에 써서 저장하되 이어서 저장될 수 있도록 함
		File f = new File(path, file);
		if(f.exists()) {
			String before = fileOpen(file);
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
				bw.write(before + s);
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
