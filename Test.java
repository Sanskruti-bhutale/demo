package com.sans.Immutable_class;

final public class Test {
	
	int i;
	public Test (int i) {
		this.i=i;
	}
	public Test modify(int i) {
		if(this.i==i) {
			return this;
		}else {
			return new Test(i);
		}
	}

}
