package Modele;

import java.util.Date;

public class Location {
    private String id;
    private String idClient;
    private String idDVD;
    private Date dateLoc;
    private Date dateRen;

    public Location() {
    }

    public String getId() {
        return id;
    }

    public String getIdClient() {
        return idClient;
    }

    public String getIdDVD() {
        return idDVD;
    }

    public Date getDateLoc() {
        return dateLoc;
    }

    public Date getDateRen() {
        return dateRen;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public void setIdDVD(String idDVD) {
        this.idDVD = idDVD;
    }

    public void setDateLoc(Date dateLoc) {
        this.dateLoc = dateLoc;
    }

    public void setDateRen(Date dateRen) {
        this.dateRen = dateRen;
    }
}