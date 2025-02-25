package com.kh.last.p5;

public class Phone {
	/**
	 * 클래스 = 데이터 + 기능
	 * 필드(변수) + 생성자 + 메서드(함수)
	 */
	private String model;
	private int price;
	private String manufacture;
	private int quantiy;
	
	public Phone() {}

	public Phone(String model, int price, String manufacture, int quantiy) {
		this.model = model;
		this.price = price;
		this.manufacture = manufacture;
		this.quantiy = quantiy;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public int getQuantiy() {
		return quantiy;
	}

	public void setQuantiy(int quantiy) {
		this.quantiy = quantiy;
	}

	@Override
	public String toString() {
		return model + ", " + price + ", " + manufacture + ", " + quantiy;
	}

}
