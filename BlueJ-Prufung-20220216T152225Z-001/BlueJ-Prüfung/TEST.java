class TEST
{
    static void Testen()
    {
        PRUEFUNG pr1 = new PRUEFUNG();
        pr1.NameSetzen ("Hans Müller");
        pr1.MuendlicheNoteSetzen  (2);
        pr1.schriftlicheNoteSetzen  (4);       
        pr1.DatenAusgeben();
        System.out.println();
        
        /*PRUEFUNG pr2 = new PRUEFUNG();
        pr2.name = "Sepp Maier";        //Übersetzt nicht, da name private 
        pr2.muendlicheNote = 42;        //...
        pr2.schriftlicheNote = 4 ;      //...
        pr2.DatenAusgeben();
        System.out.println();*/
        
        PRUEFUNG pr3 = new PRUEFUNG();
        pr3.NameSetzen("Sepp Maier");
        pr3.MuendlicheNoteSetzen(3);
        pr3.schriftlicheNoteSetzen(2) ;       
        pr3.DatenAusgeben();
        System.out.println();
    }
}