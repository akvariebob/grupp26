package org.lu.ics.labbar;

import java.util.ArrayList;

public class PersonRegister {
	private ArrayList<Person> pRegister = new ArrayList<Person>();


	public void addPerson(Person p) {
		pRegister.add(p);
	}

	public Person findPerson(String pNbr) {
		for(Person tmpPerson : pRegister) {
			if(tmpPerson.getpNbr().equals(pNbr)) {
				return tmpPerson;
			}
			
		}
		return null;
	}

	public Person removePerson(String pNbr) {
		Person pTemp = findPerson(pNbr);
		
		if(pTemp != null) {
			pRegister.remove(pTemp);
			return pTemp;
		}
		return null;
	}

}
