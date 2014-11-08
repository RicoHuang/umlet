package com.umlet.element.relation;

import com.baselet.diagram.draw.geom.Rectangle;

public class Qualifier extends Rectangle {
	String _string;

	public String getString() {
		return _string;
	}

	public Qualifier(String s, int a, int b, int c, int d) {
		super(a, b, c, d);
		_string = s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (_string == null ? 0 : _string.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Qualifier other = (Qualifier) obj;
		if (_string == null) {
			if (other._string != null) {
				return false;
			}
		}
		else if (!_string.equals(other._string)) {
			return false;
		}
		return true;
	}

}
