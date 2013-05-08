package com.std.model.appointment;

import com.std.model.pattern.RecurrencePattern;

public interface AppointmentTemplateInterface {
	public String getTitle();
	public String getDescription();
	public String getLocation();
	public long getDuration();
	public RecurrencePattern getPattern();
	public void setTitle(String title);
	public void setDescription(String description);
	public void setLocation(String loc);
	public void setDuration(long duration);
	public void setPattern(RecurrencePattern pattern);
	public void setFields(AppointmentTemplateInterface apptTmpl);
	public Object clone();
}
