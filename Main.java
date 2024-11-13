class Main{
    public static void main(String args[]){
        //Istanziare uno scaffale
        Scaffale scaffale=new Scaffale("scaffale A");
        //Istanziare due oggetti di classe Libro e aggiungerli allo scaffale
        Libro libro1=new Libro("Il diario di Anne Frank","Anne Frank",9.50f,316,"Mondadori");
        Libro libro2=new Libro("Il fu Mattia Pascal","Luigi Pirandello",12.50f,560,"Feltrinelli");
        Libro libro3=new Libro("Il piccolo principe","Antoine de Saint-Exupéry",3.32f,137,"Feltrinelli");
        Libro libro4=new Libro("Odissea","Omero",21.52f,480,"Feltrinelli");
        Libro libro5=new Libro("La ragazza nascosta","Lucinda Riley",22.00f,400,"Giunti Editore");
        scaffale.aggiungi(libro1);
        scaffale.aggiungi(libro2);
        //Visualizzare il contenuto dello scaffale
        scaffale.elencaLibri();
    }
}