class PRUEFUNGSLISTE
{
    private PRUEFUNG[] pruefungsListe;
    private int anzahl = 0;
    
    public PRUEFUNGSLISTE(int maxAnzahlNeu)
    {
       pruefungsListe = new PRUEFUNG[maxAnzahlNeu];  
    }
    
    public void PruefungHinzufuegen(String nameNeu, int muendlicheNoteNeu, int schriftlicheNoteNeu)
    {
         PRUEFUNG neuPreufung;
         neuPreufung = new PRUEFUNG();
         neuPreufung.NameSetzen(nameNeu);
         neuPreufung.MuendlicheNoteSetzen(muendlicheNoteNeu);
         neuPreufung.schriftlicheNoteSetzen(schriftlicheNoteNeu);
         anzahl++;
    }
    
    public void ListeAusgeben()
    {
       for (int i = 0; i < anzahl; i++) {
          pruefungsListe[i].DatenAusgeben();
       }
    }
}