package com.vue;

import javax.swing.table.AbstractTableModel;
import com.persistance.*;
import com.metier.*;
import java.util.ArrayList; 

public class ModeleStation extends AbstractTableModel {

	private ArrayList<Station> listeStation;
	private String[] entetes = {"idStation", "emplacement", "nombres bornes"};
	private AccesData AD;
	
	public ModeleStation() {
		listeStation = AD.getListeStation();
	}

	@Override
	public int getColumnCount() {
		return entetes.length;
	}

	@Override
	public int getRowCount() {
		return listeStation.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0 :
			return listeStation.get(rowIndex).getIdStation();
		case 1 :
			return listeStation.get(rowIndex).getLibelleEmplacement();
		case 2 :
			return listeStation.get(rowIndex).getLesBornes().size();
		default :
			throw new IllegalArgumentException();
		}
	}

	@Override
	public String getColumnName(int index) {
		return entetes[index];
	}

}
