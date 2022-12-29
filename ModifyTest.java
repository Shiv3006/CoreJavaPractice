package com.declaration28dec;

public class ModifyTest {
	private int i;

	ModifyTest(int i) {
		this.i = i;
	}

	public ModifyTest modify(int i) {
		if (this.i == i) {
			return this;
		} else {
			return (new ModifyTest(i));
		}

	}

	public static void main(String[] args) {
		ModifyTest mt = new ModifyTest(10);
		ModifyTest mt1 = new ModifyTest(100);
		ModifyTest mt2 = mt.modify(10);
		System.out.println(mt==mt1);
		System.out.println(mt==mt2);
	}

}
