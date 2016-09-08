package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Address;
import seedu.addressbook.data.person.Email;
import seedu.addressbook.data.person.Name;
import seedu.addressbook.data.person.Phone;

public class UtilsTest {

	@Test
	public void testIsAnyNull_true() {
		Object object = null;
		assertTrue(Utils.isAnyNull(object));
		assertTrue(Utils.isAnyNull(object, object, object, object, object));
		assertTrue(Utils.isAnyNull(new Object[] { null, null }));
	}

	@Test
	public void testIsAnyNull_false() {

		assertFalse(Utils.isAnyNull(Name.EXAMPLE));
		assertFalse(Utils.isAnyNull(Name.EXAMPLE, Phone.EXAMPLE, Email.EXAMPLE, Address.EXAMPLE));
		assertFalse(Utils.isAnyNull(new Object[] { Name.EXAMPLE, Name.EXAMPLE }));
	}

	@Test
	public void elementsAreUnique_return() {
		final List<String> collection1 = Arrays.asList("Welcome", "to", "CS2103");
		final List<String> collection2 = Arrays.asList("Welcome", "Welcome", "CS2103");		
		assertTrue(Utils.elementsAreUnique(collection1));
		assertFalse(Utils.elementsAreUnique(collection2));
	}
}
