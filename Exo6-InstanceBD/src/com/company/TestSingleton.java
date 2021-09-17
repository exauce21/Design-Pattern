package com.company;

public class TestSingleton {
    public static void main(String args[] )
    {
        Database database;
        database = Database.getInstance("Etudiant");
        System.out.println("Base de données: "+database.getName());

        database = Database.getInstance("Professeur");
        System.out.println("Base de données: " + database.getName());

        /*Oui, si 2 threads font en meme temps le test, et s’il n’existe pas encore d’objet BD,
          ils pourraient tous les deux dépasser le if(singleObjectbd == null) ce qui signifie que
          les deux threads créeront un objet de base de données */
    }
}
