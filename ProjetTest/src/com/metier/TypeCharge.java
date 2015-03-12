package com.metier;

public class TypeCharge {
	
	private int codeTypeCharge;
	private String libelleTypeCharge;
	private int puissanceTypeCharge;
	
	// Constructeur sans id
	public TypeCharge(String libelleTypeCharge, int puissanceTypeCharge) {
		super();
		this.libelleTypeCharge = libelleTypeCharge;
		this.puissanceTypeCharge = puissanceTypeCharge;
	}

	// Constructeur généré automatiquement
	public TypeCharge(int codeTypeCharge, String libelleTypeCharge, int puissanceTypeCharge) {
		super();
		this.codeTypeCharge = codeTypeCharge;
		this.libelleTypeCharge = libelleTypeCharge;
		this.puissanceTypeCharge = puissanceTypeCharge;
	}
	
	// getteurs et setteurs
	public String getLibelleTypeCharge() {
		return libelleTypeCharge;
	}

	public void setLibelleTypeCharge(String libelleTypeCharge) {
		this.libelleTypeCharge = libelleTypeCharge;
	}

	public int getPuissanceTypeCharge() {
		return puissanceTypeCharge;
	}

	public void setPuissanceTypeCharge(int puissanceTypeCharge) {
		this.puissanceTypeCharge = puissanceTypeCharge;
	}

	public int getCodeTypeCharge() {
		return codeTypeCharge;
	}
	
	@Override
	public String toString() {
		return "TypeCharge [codeTypeCharge=" + codeTypeCharge
				+ ", libelleTypeCharge=" + libelleTypeCharge
				+ ", puissanceTypeCharge=" + puissanceTypeCharge + "]";
	}
}
