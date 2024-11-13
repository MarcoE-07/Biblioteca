public class Libro{
    //Definizione attributi
    private String titolo;
    private String autore;
    private float prezzo;
    private int npag;
    private String editore;
    private Scaffale collocazione;

    //Definizione costruttore
    public Libro(String titolo, String autore, float prezzo, int npag, String editore){
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
        this.npag = npag;
        this.editore = editore;
        this.collocazione = collocazione;
    }
    
    //Definizione metodi 
    //Definire metodo toString()
    public String toString(){
        return String.format("titolo:%s\n autore:%s \nprezzo:%.2f€\npag:%d \neditore:%s",titolo,autore,prezzo,npag,editore)+collocazione+"\n";
    }
    public void setCollocazione(Scaffale s){
        collocazione = s;
    }
    public String getAutore(){
     return autore;
    }
    public String getPrezzo(){
        return prezzo;
    }
}