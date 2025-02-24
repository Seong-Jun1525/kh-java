package com.kh.practice.book.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BookDAO {
	private Book[] bArr = new Book[10];

	public void fileSave(Book[] bArr) {
		// 객체를 저장하는 스트림인 ObjectOutputStream을 가지고 book.txt에
		// 매개변수로 받은 bArr을 저장, 단 null이 아닌 것만 저장함
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"));) {
			for (int i = 0; i < bArr.length; i++) {
				oos.writeObject(bArr[i]); // 객체를 직렬화하여 출력 스트림에 기록
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public Book[] fileRead() {
		// 저장된 객체를 읽어오는 스트림인 ObjectInputStream을 가지고
		// book.txt에 저장된 객체를 필드 bArr에 저장하여 반환
		// 더 이상 파일에 읽을 게 없을 때 뜨는 예외인 EOFException이 발생하면
		// 예외만 잡아주고 안에는 아무 처리도 하지 않음

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"));) {
			int i = 0;
			while (true) {
//				System.out.println("qwe " + ois.readObject());
				bArr[i++] = (Book) (ois.readObject()); // 직렬화된 객체를 읽어와 원래 객체로 복원
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
//			System.out.println("EOF");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return bArr;

	}
}
