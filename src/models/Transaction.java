package models;

public class Transaction {
    private int id;
    private double solde;

    private TypeTransaction type;

    public TypeTransaction getType() {
        return type;
    }

    public void setType(TypeTransaction type) {
        this.type = type;
    }


    private Compte compte;
    public Transaction(int id, double solde) {
        this.id = id;
        this.solde = solde;
    }
    public Compte getCompte() {
        return compte;
    }

}