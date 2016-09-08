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
	public void isSimilar_false() throws IllegalValueException{
		assertFalse(name.isSimilar_notNull(null));
	}
	

	@Test
	public void isSimilar_true() throws IllegalValueException{
		assertTrue(name.isSimilar_ignoreCase(new Name("John K SMITh")));
		assertTrue(name.isSimilar_contains(new Name("John Smith")));
		assertTrue(name.isSimilar_comma(new Name("Smith, John K")));
	}

}
