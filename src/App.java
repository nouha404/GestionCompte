import models.Client;
import models.Compte;
import services.BanqueService;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        BanqueService service = new BanqueService();
        int choice;
        do {
            System.out.println("1 - Ajouter Client");
            System.out.println("2 - Lister Client");
            System.out.println("3 - Creer Compte");
            System.out.println("4 - Lister Comptes");
            System.out.println("5 - Lister Compte d'un Client");
            System.out.println("6 - Faire Transaction");
            System.out.println("7 - Lister les transaction d'un  Client");
            System.out.println("8 - Quitter");
            System.out.println(" Votre Choix : ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    Client client = new Client();
                    System.out.println("L'id : ");
                    client.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Nom Complet : ");
                    client.setNomComplet(sc.nextLine());

                    System.out.println("Numero de tel : ");
                    client.setTel(sc.nextLine());

                    service.addClient(client);
                    break;
                case 2:
                    Client[] clients = service.listerClient();
                    for (Client cl: clients) {
                        if(cl != null){
                            System.out.println(cl.toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Id du Client : ");
                    int idClient = sc.nextInt();
                    client = service.searchClientById(idClient);
                    if(client == null){
                        System.out.println("Ce Client n'existe pas");
                    } else {
                        Compte compte = new Compte();
                        System.out.println("L'id : ");
                        compte.setId(sc.nextInt());
                        sc.nextLine();

                        System.out.println("Numero");
                        compte.setNumero(sc.nextLine());

                        System.out.println("solde : ");
                        compte.setSolde(sc.nextDouble());
                        // relation compte vers client
                        compte.setClient(client);
                        // relation client -> compte
                        client.addInArrayCompte(compte);

                        service.creerCompte(compte);
                    }
                    break;
                case 4:
                    Compte[] allcomptes = service.listerCompte();
                    for (Compte compt :allcomptes) {
                        if (compt != null){
                            System.out.println(compt);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Id du Client : ");
                    Client client1 = service.searchClientById(sc.nextInt());
                    if ( client1== null) {
                        System.out.println("Client n'existe pas");
                    } else {
                        allcomptes = client1.getArrayCompte();
                        for (Compte compt :allcomptes) {
                            if (compt != null){
                                System.out.println(compt);
                            }
                        }
                    }
                    break;
                case 6:
                    break;
                case 7:
                    break;
            }

        } while (choice !=8);

    }
}
