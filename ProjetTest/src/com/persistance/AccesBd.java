package com.persistance;

import java.sql.*;
//	 classe permettant l'ouverture, la fermeture d'une base et le retour du statement
public class AccesBd {
	        // description des propri�t�s
	        private  static Connection con;
	        private  static String url;
	     	 // constructeur re�oit en param�tre le nom de la DSN access
	        public static Connection  getInstance(String nomdsn) {

	        	url="jdbc:odbc:"+nomdsn;
	        	con=null;
	        	try
	        	{// chargement du driver
	        		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	        		con=DriverManager.getConnection(url,"","");
	        	}

	        	// ouverture de la connexion
	        	catch (ClassNotFoundException e)

	        	{
	        		System.out.println(e.getMessage());
	        		System.out.println("�chec driver");
	        	}

	        	catch (SQLException e)

	        	{
	        		System.out.println(e.getMessage());
	        		System.out.println("�chec de connexion bd ");
	        	}

	        	return con;
	        }
	        //	 fermeture de la connexion
	        public static void close(){
	                try { 
	                	con.close();
	                	}
	                catch(Exception e) {e.printStackTrace();
	                System.out.println("probl�me lors de la fermeture");}
	        }
	}


