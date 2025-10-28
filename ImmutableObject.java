package com.sans.Immutable_class;

public class ImmutableObject {

	public static void main(String[] args) {
		Test t1 = new Test(10);
		Test t2 = t1.modify(20);
		System.out.println(t1==t2);
		Test t3=t1.modify(10);
		Test t4 = t2.modify(20);
		System.out.println(t1==t3);
		System.out.println(t2==t4);

	}

}
