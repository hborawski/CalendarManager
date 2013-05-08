package com.std.controller.listener;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioButtonListener implements ItemListener{
	int eventImportance = 0;
	@Override
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
	}
	
	public int getEventImportance(){
		System.out.print(eventImportance);
		return eventImportance;
	}

	

}
