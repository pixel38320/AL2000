package Modele;

import oracle.sql.ARRAY;

import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;


public class TestDVD {
    public static void main(String[] argv) throws SQLException {
        ArrayList<Personne> acts = new ArrayList<Personne>();
        acts.add(new Personne("Pitt", "brad"));
        acts.add(new Personne("Dicaprio", "Ronamdo"));

        ArrayList<Genre> genres = new ArrayList<Genre>();
        genres.add(Genre.Documentaire);
        Film f = new Film("avatir", "Disney",new Personne("comeron", "james"),"bonjour", acts ,new Date(),"ezfqzef",0,null,genres);

        FilmDAO sDAO = new FilmDAO();
        //sDAO.create(f);
        System.out.println(sDAO.read("avatir").toString());
        System.out.println("NBacteurs :"+sDAO.read("avatir").getActeurs().size());
        sDAO.connection.close();


        DVD dvd = new DVD(3028, f, true,false);
        DvdDAO fDAO = new DvdDAO();
        //fDAO.create(dvd);
        dvd.setEstDispo(false);
        dvd.setEstReservable(true);
        fDAO.update(dvd);
        fDAO.read(3028);
        fDAO.connection.close();
    }
}