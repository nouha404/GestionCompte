package services;

import models.Client;
import models.Compte;
import models.Transaction;

public class BanqueService {
    private final int N = 10;
    private Client[] arrayClient = new Client[N];
    private int nombreClient;

    private Compte[] arrayCompte = new Compte[N];
    private int nombreCompte;

    private Transaction[] arrayTransaction = new Transaction[N];
    private int nombreTransaction;
    public void addClient(Client client){
       arrayClient[nombreClient] = client;
       nombreClient++;
    }
    public Client [] listerClient(){
        return arrayClient;
    }
    public void creerCompte(Compte compte){
        arrayCompte[nombreCompte] = compte;
        nombreCompte++;
    }
    public Compte[] listerCompte(){
        return arrayCompte;
    }
    public Client searchClientById(int id){
        for (int i=0; i<arrayClient.length; i++){
            if(arrayClient[i].getId() == id){
                return arrayClient[i];
            }
        }
        return null;
    }
    public void saveTransaction(Transaction transaction){
        arrayTransaction[nombreTransaction] = transaction;
        nombreTransaction++;
    }
    public Compte searchCompteByNumber(String numero){
        //us equals when we have a String
        for (int i=0; i<arrayCompte.length;i++){
            if(arrayCompte[i].getNumero() == numero){
                return arrayCompte[i];
            }
        }
        return null;
    }
}
