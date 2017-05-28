package com.unit.impl;

import com.unit.DataElement;

public class PropertyElement {
	
	private String name;
	private DataElement dataElement;

	public PropertyElement(String name, DataElement dataElement) {
		this.name = name;
		this.dataElement = dataElement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DataElement getDataElement() {
		return dataElement;
	}

	public void setDataElement(DataElement dataElement) {
		this.dataElement = dataElement;
	}

}
