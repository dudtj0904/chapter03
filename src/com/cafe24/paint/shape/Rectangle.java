package com.cafe24.paint.shape;

public class Rectangle extends Shape {
	private int width;
	private int height;
	
	public Rectangle(int width, int height ) {
		this.width = width;
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println( "사각형을 그렸습니다." );
	}
	
	
}
