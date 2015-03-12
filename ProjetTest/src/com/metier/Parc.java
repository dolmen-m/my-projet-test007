package com.metier;
import java.util.*;

public class Parc {
	// liste des stations de la ville
	private ArrayList<Station> leParcStation;

	// constructeur
	public Parc() {
		super();
		this.leParcStation = new ArrayList<Station>();
	}
	
	// getteurs et setteurs
	public ArrayList<Station> getLeParcStation() {
		return leParcStation;
	}

	public void setLeParcStation(ArrayList<Station> leParcStation) {
		this.leParcStation = leParcStation;
	}
	
	// ajoute une station
	public void ajouterStation(Station s)
	{
		leParcStation.add(s);
	}
	
	// ramène le nombre de stations
	public int getNbStation()
	{
		return leParcStation.size();
	}
	
	// ramène le nombre total de bornes pour toutes les stations
    public int GetNbBorne()
    {
        int nb = 0;
        for (Station s : leParcStation)
        {
            nb = nb + s.getLesBornes().size();
        }
        return nb;
    }
    
    // ramène la liste de bornes de la station
    // dont l'id est passé en paramètre
    // ramène null si la station n'existe pas 
    public ArrayList<Borne> getLaStation(int id)
    {
        int i = 0;
        boolean trouve = false;
        Station s;
        ArrayList<Borne> listeB = null;
        while ((trouve == false) && (i < leParcStation.size()))
        {
            s = leParcStation.get(i);
            if (s.getIdStation() == id)
            {
                listeB = s.getLesBornes();
                trouve = true;
            }
            else
            {
                i++;
            }
        }
        return listeB;
    }
    
    // ramène la liste de station correspondant a l'id typecharge passer en param
    public ArrayList<Station> getStationTypeCharge(int idTypeCharge)
    {
        //Station station;
        ArrayList<Station> LT = new ArrayList<Station>();

        int index = 0;
        boolean bornePossible = false; // utiliser pour stopper la boucle

        for (Station s : leParcStation)
        {
            // ne rentre dans la boucle uniquement s'il n'y a pas de borne possible deja trouve et que l'index < nbr bornes de la station
            while (bornePossible == false && index < s.getLesBornes().size())
            {
                if (idTypeCharge + 1 == s.getLesBornes().get(index).getTypeBorne().getCodeTypeCharge())
                {
                    //station = leParcStation.get(index);
                    LT.add(s);
                    bornePossible = true;
                }
                index = index + 1;
            }
            index = 0;
            bornePossible = false;
        }

        return LT;
    }
}
