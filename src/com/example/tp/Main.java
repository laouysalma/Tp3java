package com.example.tp;
//la classe Main de l'exercice 1

/*
public class Main {
    public static void main(String[] args) {
    	
        Etudiant et1 = new Etudiant("Laouy", "Soumia");
        Etudiant et2 = new Etudiant("Rami", "Asmae");

        et1.ajouterNote(11.5);
        et1.ajouterNote(14.0);
        et1.ajouterNote(15.0);
        et2.ajouterNote(10.0);
        et2.ajouterNote(19.5);
        et2.ajouterNote(9.0);
        et2.ajouterNote(18.0);
        et2.ajouterNote(12.0);
        et2.ajouterNote(9.0);
        et2.ajouterNote(3.0);



        et1.afficherNotes();
        System.out.println(et1);

        et2.afficherNotes();
        System.out.println(et2);
    }
}
*/
//la classe Main de l'exercice 2

public class Main {
    public static void main(String[] args) {

    	Filiere info   = new Filiere("Informatique");
        Filiere genie  = new Filiere("Génie Civil");


        Etudiant e1 = new Etudiant("Semlali", "houda");
        Etudiant e2 = new Etudiant("Bouya", "Fatima");
        Etudiant e3 = new Etudiant("Chouaib", "Yassine");
        Etudiant e4 = new Etudiant("Laouy","Salma");
        Etudiant e5 = new Etudiant("Hani","Hmid");
        Etudiant e6 = new Etudiant("Moutawakil", "Soukaina");


        info.ajouterEtudiant(e1);
        info.ajouterEtudiant(e2);
        info.ajouterEtudiant(e3);
        info.ajouterEtudiant(e4);
        info.ajouterEtudiant(e5);

        info.ajouterEtudiant(e6);

        genie.ajouterEtudiant(new Etudiant("Bousta", "Khadija"));
        genie.ajouterEtudiant(new Etudiant("Laamiri","Saida"));

        System.out.println(info);
        info.afficherEtudiants();
        System.out.println();

        System.out.println(genie);
        genie.afficherEtudiants();
        System.out.println();

        System.out.println("Détail de e3 : " + e3);
    }
}

