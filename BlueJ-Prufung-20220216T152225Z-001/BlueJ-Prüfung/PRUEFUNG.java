class PRUEFUNG
{
    private String name;
    private int muendlicheNote;
    private int schriftlicheNote;
    
    public PRUEFUNG()
    {
        name ="";
        muendlicheNote = 0; // noch keine note
        schriftlicheNote = 0;
        
    }
    
    public void MuendlicheNoteSetzen(int muendlicheNoteNeu)
    {
        if(muendlicheNoteNeu >= 1 && muendlicheNoteNeu <= 6)
        {
            muendlicheNote = muendlicheNoteNeu;  
        }
        else
        {
            System.out.println("Keine zulässige Note.");   
        }
    }
    
    public int MuendlicheNoteGeben()
    {
        return muendlicheNote;         
    }
    
    public void schriftlicheNoteSetzen(int schriftlicheNoteNeu)
    {
        if(schriftlicheNoteNeu >= 1 && schriftlicheNoteNeu <= 6)
        {
            schriftlicheNote = schriftlicheNoteNeu;  
        }
        else
        {
            System.out.println("Keine zulässige Note.");            
        }
    }
    
    public int schriftlicheNoteGeben()
    {
        return muendlicheNote;   
    }
       
    
    public void NameSetzen(String nameNeu)
    {
        if(nameNeu != "")
        {
            name = nameNeu;  
        }
        else
        {
            System.out.println("Keine zulässiger name.");   
        }
    }
    
    public String NameGeben()
    {
        return name;   
    }
       
    public void DatenAusgeben()
    {
         System.out.print("PrÜfling: ");
         if(name == "")
         {
             System.out.println("nicht eingegeben");  
         }
         else
         {
             System.out.println(name);
         }
        System.out.print("schriftlicheNote: " + schriftlicheNote);
        if(schriftlicheNote == 0)
        {
            System.out.println("nicht vorhanden");
        }
        else
        {
            System.out.println(schriftlicheNote);
        }
        System.out.print("muendlicheNote: " + muendlicheNote);
        if(muendlicheNote == 0)
        {
            System.out.println("nicht vorhanden");
        }
        else
        {
            System.out.println(muendlicheNote);
        }
        System.out.print("Gesamtnote: " );
        if(GesamtNoteBerechnen() == 0)
        {
            System.out.println("wegen fehlender Noten nicht berechenebar");
        }
        else
        {
            System.out.println(GesamtNoteBerechnen());
        }
    }
    
    public double GesamtNoteBerechnen()
    {
          if(muendlicheNote > 0 && schriftlicheNote > 0)
        {
            return (schriftlicheNote*4 + muendlicheNote)*1.0 / 5;
        }
        else
        {
            return 0;
        }
    }
    
}