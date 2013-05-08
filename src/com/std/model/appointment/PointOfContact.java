package com.std.model.appointment;
/**
 * Decorator
 * Supports name and number for a contact, displayed at the
 * end of the description, the phone number is stored as a string,
 * no format checking is done here
 * @author Michael
 *
 */
public class PointOfContact extends AppointmentDecorator {
	private String name = "unknown";
	private String number = "unknown";
	
	public PointOfContact(AppointmentTemplate appt) {
		super(appt);
	}
	
	public PointOfContact(AppointmentTemplate appt, String nm) {
		super(appt);
		name = nm;
	}
	
	public PointOfContact(AppointmentTemplate appt, String nm, String num) {
		super(appt);
		name = nm;
		number = num;
	}
	
	public String getDescription(){
		return super.getDescription() + "\nName: " + name + "\nPhone: " + number;
	}

	public String getContactName(){
		return name;
	}
	
	public String getContactNumber(){
		return number;
	}
	
	public void setContactName(String nm){
		name = nm;
	}
	
	public void setContactNumber(String num){
		number = num;
	}
}