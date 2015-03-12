package com.persistance;
import java.util.ArrayList;
import java.sql.*;

import com.metier.*;

public class BorneDAO extends DAO<Borne> {

	@Override
	public boolean create(Borne obj) {
		// TODO Auto-generated method stub
		String sql = "insert into Borne (dateMiseEnService, idStation, idType) values ('"+obj.getDateMiseEnService()+"', "+obj.getIdStation()+", "+ obj.getTypeBorne().getCodeTypeCharge()+" );";
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
	public boolean delete(Borne obj) {
		// TODO Auto-generated method stub
		String sql = "delete from Borne where idBorne = " + obj.getIdBorne() + ";";
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
	public boolean update(Borne obj) {
		// TODO Auto-generated method stub
		String sql = "update Borne set dateMiseEnService = '" + obj.getDateMiseEnService() + "', idStation = " + obj.getIdStation() + " where idBorne = " + obj.getIdBorne() + ";";
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
	public Borne find(int idBorne) {
		// TODO Auto-generated method stub
		// création requêtes et variables
		String sql = "select * from Borne WHERE idBorne =" + idBorne + ";";
		ResultSet rs;       
		Borne b = null;
		TypeChargeDAO typeC = new TypeChargeDAO();
		TypeCharge tc = null;
		
		try {
			rs = this.cnx.createStatement().executeQuery(sql);
			if (rs.next())
			{
				int id = rs.getInt("idBorne");
				String date = rs.getString("dateMiseEnService");
				int idStation = rs.getInt("idStation");
				tc = typeC.find(id);
				b = new Borne(id, date, tc, idStation);
				//listeB.add(b);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
		return b;
	}

	@Override
	public ArrayList<Borne> retrieve() {
		// TODO Auto-generated method stub
		// création requêtes et variables
		String sql = "select * from Borne";
		ResultSet rs;       
		Borne b = null;
		ArrayList<Borne> listeB = new ArrayList<Borne>();
		TypeChargeDAO typeC = new TypeChargeDAO();
		TypeCharge tc = null;
		
		try {
			rs = this.cnx.createStatement().executeQuery(sql);
			while (rs.next())
		    {
				int id = rs.getInt("idBorne");
				String date = rs.getString("dateMiseEnService");
				int idStation = rs.getInt("idStation");
				tc = typeC.find(id);
				b = new Borne(id, date, tc, idStation);
				listeB.add(b);
		    }
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
		return listeB;
	}
	
	public ArrayList<Borne> retrieve(int id) {
		// TODO Auto-generated method stub
		// création requêtes et variables
		String sql = "select * from Borne WHERE idStation =" + id + ";";
		ResultSet rs;       
		Borne b;
		ArrayList<Borne> listeB = new ArrayList<Borne>();
		TypeChargeDAO typeC = new TypeChargeDAO();
		TypeCharge tc;
		
		try {
			rs = this.cnx.createStatement().executeQuery(sql);
			while (rs.next())
		    {
				int idBorne = rs.getInt("idBorne");
				String date = rs.getString("dateMiseEnService");
				int idStation = rs.getInt("idStation");
				tc = typeC.find(id);
				b = new Borne(idBorne, date, tc, idStation);
				listeB.add(b);
		    }
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
		return listeB;
	}

}
