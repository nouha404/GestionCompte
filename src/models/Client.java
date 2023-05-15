package models;

import java.util.Objects;

public class Client {
    private int id;
    private String nomComplet;
    private String tel;

    public Client() {
    }

    public Client(int id, String nomComplet, String tel, String[] arrayClient) {
        this.id = id;
        this.nomComplet = nomComplet;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nomComplet='" + nomComplet + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client client)) return false;
        return id == client.id && Objects.equals(nomComplet, client.nomComplet) && Objects.equals(tel, client.tel);
    }

    //attribut navigationnels
    // final == taille
    private final int N = 10;
    private Compte[] arrayCompte = new Compte[N];
    private int nombreCompte;

    public Compte[] getArrayCompte() {
        return arrayCompte;
    }

    public void addInArrayCompte(Compte compte){
        arrayCompte[nombreCompte] = compte;
        nombreCompte++;
    }
    //a chaque fois que l'on a une relation oneToMany on aura deux methode :  get et add

}
