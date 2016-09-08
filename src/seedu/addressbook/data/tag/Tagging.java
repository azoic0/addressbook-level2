package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
	
	private boolean tagStatus;
	private Person person;
	private Tag tag;
	
	private final String plusSign = "+";
	private final String minusSign = "-";
	
	
	public Tagging (boolean tagStatus, Person person, Tag tag){
		this.tagStatus = tagStatus;
		this.person = person;
		this.tag = tag;
	}
	
	public String toString(){
		if(tagStatus == true)
			return plusSign + person.getName() + " " + tag;
		else
			return minusSign + person.getName() + " " + tag;
	}
	
	

}
