package com.std.model.appointment;
/**
 * Decorator
 * Supports different levels of importance with appointments
 * leveling from 0 - 3, any other number being treated as 0
 * displayed at the beginning of the description
 * @author Michael
 *
 */
public class ImportanceLevel extends AppointmentDecorator {
	private int importance = 0;
	
	public ImportanceLevel(AppointmentTemplate appt) {
		super(appt);
	}
	
	public ImportanceLevel(AppointmentTemplate appt, int imp) {
		super(appt);
		importance = imp;
	}

	public String getDescription(){
		String out = "Importance: ";
		if(importance == 1){
			out += "low\n";
		} else if(importance == 2){
			out += "medium\n";
		} else if(importance == 3){
			out += "high\n";
		} else {
			out += "none\n";
		}
		return out + super.getDescription();
	}
	
	public int getImportance(){
		return importance;
	}
	
	public void setImportance(int imp){
		importance = imp;
	}
}
