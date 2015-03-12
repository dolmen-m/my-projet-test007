package com.vue;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PanelStation extends JPanel {
	private JLabel lblListeStations;
	private JScrollPane scrollPane;
	private JTable tableStations;
	private ModeleStation modele;

	/**
	 * Create the panel.
	 */
	public PanelStation() {
		setLayout(null);
		add(getLblListeStations());
		add(getScrollPane());

	}
	private JLabel getLblListeStations() {
		if (lblListeStations == null) {
			lblListeStations = new JLabel("Liste des Stations");
			lblListeStations.setBounds(54, 52, 103, 21);
		}
		return lblListeStations;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(32, 95, 380, 162);
			scrollPane.setViewportView(getTableStations());
		}
		return scrollPane;
	}
	private JTable getTableStations() {
		if (tableStations == null) {
			tableStations = new JTable(modele);
		}
		return tableStations;
	}
}
