package com.persistance;
import java.util.ArrayList;
import java.sql.*;

import com.metier.*;

public class TypeChargeDAO extends DAO<TypeCharge> {

	public TypeChargeDAO() {
		super();
	}

	@Override
	public boolean create(TypeCharge obj) {
		// TODO Auto-generated method stub
		String sql = "insert into TypeBorne (libelleTypeBorne, puissanceCharge) values ('" + obj.getLibelleTypeCharge() + "', " + obj.getPuissanceTypeCharge() + ");";
		boolean ok = false;
		
		try {
			cnx.createStatement().executeUpdate(sql);
			ok = true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			ok = false;
		}
		return ok;
	}

	@Override
	public boolean delete(TypeCharge obj) {
		// TODO Auto-generated method stub
		String sql = "delete from TypeBorne where idType = " + obj.getCodeTypeCharge() + ";";
		boolean ok = false;
		
		try {
			cnx.createStatement().executeUpdate(sql);
			ok = true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			ok = false;
		}
		return ok;
	}

	@Override
	public boolean update(TypeCharge obj) {
		// TODO Auto-generated method stub
		String sql = "update TypeBorne set libelleTypeBorne = '" + obj.getLibelleTypeCharge() + "', puissanceCharge = " + obj.getPuissanceTypeCharge() + " where idType = " + obj.getCodeTypeCharge() + ";";
		boolean ok = false;
		
		try {
			cnx.createStatement().executeUpdate(sql);
			ok = true;
		}
		catch (SQLException e) {
			e.printStackTrace();
			ok = false;
		}
		return ok;
	}

	@Override
	public TypeCharge find(int id) {
		// TODO Auto-generated method stub
		// création requêtes et variables
		String sql = "SELECT * FROM TypeBorne WHERE idType =" + id + ";";
		ResultSet rs;       
		TypeCharge tc = null;
		
		try {
			rs = this.cnx.createStatement().executeQuery(sql);
			if(rs.next())
			{
				int idType = rs.getInt("idType");
				String libelle = rs.getString("libelleTypeBorne");
				int puissance = rs.getInt("puissanceCharge");
				tc = new TypeCharge(idType, libelle, puissance);
			}	
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}        
		return tc;
	}

	@Override
	public ArrayList<TypeCharge> retrieve() {
		// TODO Auto-generated method stub

		// création requêtes et variables
		String sql = "select * from TypeBorne;";
		ResultSet rs;       
		TypeCharge tc = null;
		ArrayList<TypeCharge> listeTC = new ArrayList<TypeCharge>();
		
        try {
			rs = this.cnx.createStatement().executeQuery(sql);
			
			while (rs.next())
	        {
				int id = rs.getInt("idType");
				String libelle = rs.getString("libelleTypeBorne");
				int puissance = rs.getInt("puissanceCharge");
				tc = new TypeCharge(id, libelle, puissance);
				listeTC.add(tc);
	        }
	    }
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return listeTC;
	}

}
