package com.persistance;
import com.metier.*;

import java.sql.*;
import java.util.ArrayList;

public class StationDAO extends DAO<Station> {

	@Override
	public boolean create(Station obj) {
		// TODO Auto-generated method stub
		String sql = "insert into Station (libelleEmplacement) values ('"+obj.getLibelleEmplacement()+"');";
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
	public boolean delete(Station obj) {
		// TODO Auto-generated method stub
		String sql = "delete from Station where idStation = " + obj.getIdStation() + ";";
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
	public boolean update(Station obj) {
		// TODO Auto-generated method stub
		String sql = "update Station set libelleEmplacement = '" + obj.getLibelleEmplacement() + "' where idStation = "+obj.getIdStation()+"; ";
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
	public Station find(int idStation) {
		// TODO Auto-generated method stub
		// création requêtes et variables
		String sql = "select * from Station WHERE idStation =" + idStation + ";";
		ResultSet rs;
		Station s = null;
		ArrayList<Borne> listeB = new ArrayList<Borne>();
		BorneDAO borne = new BorneDAO();
					
		try {
			rs = this.cnx.createStatement().executeQuery(sql);
			if (rs.next())
			{
				int id = rs.getInt("idStation");
				String emplacement = rs.getString("libelleEmplacement");
				s = new Station(id, emplacement);
				listeB = borne.retrieve(id);
				s.setLesBornes(listeB);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
		return s;
	}

	@Override
	public ArrayList<Station> retrieve() {
		// TODO Auto-generated method stub
		// création requêtes et variables
		String sql = "select * from Station";
		ResultSet rs;
		Station s;
		ArrayList<Station> listeS = new ArrayList<Station>();
		ArrayList<Borne> listeB = new ArrayList<Borne>();
		BorneDAO borne = new BorneDAO();
			
		try {
			rs = this.cnx.createStatement().executeQuery(sql);
			while (rs.next())
			{
				int id = rs.getInt("idStation");
				String emplacement = rs.getString("libelleEmplacement");
				s = new Station(id, emplacement);
				listeB = borne.retrieve(id);
				s.setLesBornes(listeB);
				listeS.add(s);
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}       
		return listeS;
	}

}
