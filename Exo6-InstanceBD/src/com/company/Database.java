package com.company;

public class Database {
    private static Database singleObjectbd;
    private int record;
    private String name;

    private Database(String val)
    {
        name = val;
        record = 0;
    }

    public static Database getInstance(String val)
    {
        if (singleObjectbd == null){
            singleObjectbd = new Database(val);
        }
        return singleObjectbd;
    }

    public void editRecord(String operation)
    {
        System.out.println("Effectuer un " + operation + " opération sur dossier " + record + " dans le BD " + name);
    }

    public String getName()
    {
        return name;
    }
}
