package com.company;

public class Journalisation {
    private static Journalisation journalisation;
    private String log;

    private Journalisation() {
        log = new String();
    }

    public static Journalisation getInstance() {

        if(journalisation==null) {
            journalisation = new Journalisation();
        }
        return journalisation;
    }

    public void ajouterLog(String log) {
        this.log+=log+"\n";
    }

    public String afficherLog() {
        return log;
    }
}
