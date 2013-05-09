package com.std.controller.listener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import com.std.model.appointment.AppointmentTemplate;
import com.std.model.appointment.ImportanceLevel;
import com.std.model.appointment.RefAppointment;

public class RadioButtonListener implements ItemListener{
	int eventImportance = 0;
	AppointmentTemplate tem;
	RefAppointment appt;
	public RadioButtonListener(RefAppointment appt){
		this.appt = appt;
		tem = appt.getTemplate();
	}
	
	public void itemStateChanged(ItemEvent e) {
		String item = e.getItem().toString();
		
		if (item.equals("highImportance")){
			//set a variable equal to an integer for the model to use
			eventImportance = 3;
		}
		else if(item.equals("mediumImportance")){
			eventImportance = 2;
		}
		else if(item.equals("lowImportance")){
			eventImportance = 1;
		}
		else{
			eventImportance = 0;
		}
		System.out.println(eventImportance);
		ImportanceLevel dec = new ImportanceLevel(tem, eventImportance);
		System.out.println(dec.getImportance());
		appt.setTemplate(dec);
	}

	

}
