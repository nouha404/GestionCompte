package models;

import java.util.Objects;

public class Compte {
    private int id;
    private String numero;
    private double solde;

    public Compte() {
    }

    public Compte(int id, String numero, double solde) {
        this.id = id;
        this.numero = numero;
        this.solde = solde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", solde=" + solde +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Compte compte)) return false;
        return id == compte.id && Double.compare(compte.solde, solde) == 0 && Objects.equals(numero, compte.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numero, solde);
    }
}
