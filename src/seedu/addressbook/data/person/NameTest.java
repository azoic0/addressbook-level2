package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
	
	private Name name;
	
	@Before
	public void setup() throws IllegalValueException{
		name = new Name("John K Smith");
	}
	
	@Test
	public void isSimilar_true(){
		assertTrue(name.isSimilar(null));
	}

}
