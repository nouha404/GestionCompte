package models;

import java.util.Objects;

public class Client {
    private int id;
    private String nomComplet;
    private String tel;
    private String[] arrayClient;
    private String[] arrayCompte;
    private String[] arrayTransaction;

    public Client() {
    }

    public Client(int id, String nomComplet, String tel, String[] arrayClient) {
        this.id = id;
        this.nomComplet = nomComplet;
        this.tel = tel;
        this.arrayClient = new String[]{arrayClient[0]};
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

    /*
        public void ajoutClient(int id, String nomComplet, String tel){
        //Client nouveauClient = new Client(id,nomComplet,tel);
        if (arrayClient == null) {
            arrayClient = new String[]{nouveauClient.toString()};
        } else {
            String[] nouveauArrayClientWithoutNullVal = new String[arrayClient.length + 1];
            for (int i = 0; i< arrayClient.length; i++){
                nouveauArrayClientWithoutNullVal[i] = arrayClient[i];
            }
            nouveauArrayClientWithoutNullVal[arrayClient.length] = nouveauClient.toString();
            arrayClient = nouveauArrayClientWithoutNullVal;
        }

    }
     */

}
