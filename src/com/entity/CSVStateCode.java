package com.entity;

public class CSVStateCode {
	int id;
	String state;
	int tin;
	String code;

	public CSVStateCode(int id, String state, int tin, String code) {
		super();
		this.id = id;
		this.state = state;
		this.tin = tin;
		this.code = code;
	}

	@Override
	public String toString() {
		return "CSVStateCode [id=" + id + ", state=" + state + ", tin=" + tin + ", code=" + code + "]";
	}

}
