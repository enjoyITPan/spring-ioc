package com.unit.impl;

import com.unit.DataElement;

public class ValueElement implements DataElement {

	    private Object value;
	    
		public ValueElement(Object value) {
			this.value = value;
		}

		@Override
		public String getType() {
			return "value";
		}

		@Override
		public Object getValue() {
			return this.value;
		}


}
