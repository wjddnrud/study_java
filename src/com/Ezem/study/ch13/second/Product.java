package com.Ezem.study.ch13.second;

public class Product<T, M> {
	
	
	//generic Type
	private T kind;	// String? Integer? another object?
	private M model;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}

}
