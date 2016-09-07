package seedu.addressbook.data.person;

public class Contact {

	public String value;
	public boolean isPrivate;

	public String toString() {
		return value;
	}

	public int hashCode() {
		return value.hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}

}
