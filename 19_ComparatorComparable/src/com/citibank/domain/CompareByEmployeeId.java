package com.citibank.domain;

import java.util.Comparator;

public class CompareByEmployeeId  implements Comparator<Employe> {

	@Override
	public int compare(Employe e1, Employe e2) {
		// TODO Auto-generated method stub
		return e1.getEmployeeID() - e2.getEmployeeID();
		
	}

}
