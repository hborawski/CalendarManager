package com.std.model.appointment;

import com.std.model.pattern.RecurrencePattern;

/**
 * Class from which other decorators shall inherit, supports all the functionality
 * of the AppointmentTemplate that the Decorator stores
 * @author Michael
 *
 */
public class AppointmentDecorator extends AppointmentTemplate implements AppointmentTemplateInterface {
	//wouldn't have extended AppointmentTemplate but it needs to not break the set of them used elsewhere
	private AppointmentTemplate apptTem;
	public AppointmentDecorator(AppointmentTemplate appt){
		super("filler", "filler", "filler", 0);
		apptTem = appt;
	}
	
	public String getTitle(){
		return apptTem.getTitle();
	}
	
	public String getDescription(){
		return apptTem.getDescription();
	}
	
	public String getLocation(){
		return apptTem.getLocation();
	}
	
	public long getDuration(){
		return apptTem.getDuration();
	}
	
	public RecurrencePattern getPattern(){
		return apptTem.getPattern();
	}
	
	public void setTitle(String title){
		apptTem.setTitle(title);
	}
	
	public void setDescription(String description){
		apptTem.setDescription(description);
	}
	
	public void setLocation(String loc){
		apptTem.setLocation(loc);
	}
	
	public void setDuration(long duration){
		apptTem.setDuration(duration);
	}
	
	public void setPattern(RecurrencePattern pattern){
		apptTem.setPattern(pattern);
	}
	
	public void setFields(AppointmentTemplateInterface apptTmpl){
		apptTem.setFields(apptTmpl);
	}
	
	public Object clone(){
		return apptTem.clone();
	}
}
