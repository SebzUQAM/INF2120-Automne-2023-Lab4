/**
 * Cette classe représente une exception personnalisée pour indiquer qu'une instance de PeutEtre ne contient rien.
 */
public class ARien extends Exception {

    /**
     * Constructeur par défaut de l'exception ARien.
     * Crée une nouvelle instance d'ARien sans message d'erreur.
     */
    public ARien(){
        super();
    }

    /**
     * Constructeur de l'exception ARien avec un message d'erreur personnalisé.
     *
     * @param message Le message d'erreur décrivant la raison de l'exception.
     */
    public ARien( String message ){
        super( message );
    }
}