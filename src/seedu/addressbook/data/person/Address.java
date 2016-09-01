package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book. Guarantees: immutable; is
 * valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

	public static final String EXAMPLE = "123, some street";
	public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";
	public static final String ADDRESS_VALIDATION_REGEX = ".+";

	// public final String value;

	private Block block;
	private Street street;
	private Unit unit;
	private PostalCode postalCode;
	private boolean isPrivate;

	/**
	 * Validates given address.
	 *
	 * @throws IllegalValueException
	 *             if given address string is invalid.
	 */
	public Address(String address, boolean isPrivate) throws IllegalValueException {
		this.isPrivate = isPrivate;
		String[] splitAddress = address.split(", ");
		if (!isValidAddress(splitAddress)) {
			throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
		}
		// this.value = address;
		block = new Block(splitAddress[0]);
		street = new Street(splitAddress[1]);
		unit = new Unit(splitAddress[2]);
		postalCode = new PostalCode(splitAddress[3]);

	}

	/**
	 * Returns true if a given string is a valid person email.
	 */
	public static boolean isValidAddress(String[] splitAddress) {
		return splitAddress.length==4;//return test.matches(ADDRESS_VALIDATION_REGEX);
	}

	@Override
	public String toString() {
		// return value;
		return block.getBlock() + ", " + street.getStreet() + ", " + unit.getUnit() + ", " + postalCode.getPostalCode();
	}

	@Override
	public boolean equals(Object other) {
		/*
		 * return other == this // short snstanceof Address // instanceof
		 * handles nulls && this.value.equals(((Address) other).value)); //
		 * state check
		 */
		return other == this
				&& this.toString().equals(((Address) other).toString());
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}
}

class Block {

	private String block;

	public Block() {
		block = "";
	}

	public Block(String block) {
		this.block = block;
	}

	public String getBlock() {
		return block;
	}

}

class Street {

	private String street;

	public Street() {
		street = "";
	}

	public Street(String street) {
		this.street = street;
	}

	public String getStreet() {
		return street;
	}
}

class Unit {

	private String unit;

	public Unit() {
		unit = "";
	}

	public Unit(String unit) {
		this.unit = unit;
	}

	public String getUnit() {
		return unit;
	}
}

class PostalCode {

	private String postalCode;

	public PostalCode() {
		postalCode = "";
	}

	public PostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPostalCode() {
		return postalCode;
	}
}