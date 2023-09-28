/**
 * Cette classe représente une instance de PeutEtre qui contient une valeur de type T.
 *
 * @param <T> Le type de valeur contenue dans cette instance.
 */
public class QQChose <T> extends PeutEtre<T> {

    /**
     * La valeur contenue dans cette instance.
     */
    protected T valeur;

    /**
     * Constructeur de la classe QQChose.
     *
     * @param a_valeur La valeur de type T à stocker dans cette instance.
     */
    public QQChose( T a_valeur ){
        valeur = a_valeur;
    }

    /**
     * Indique que cette instance contient quelque chose.
     *
     * @return true car cette instance contient une valeur.
     */
    public boolean estQQChose(){
        return true;
    }

    /**
     * Indique que cette instance ne contient rien.
     *
     * @return false car cette instance contient une valeur.
     */
    public boolean estRien(){
        return false;
    }

    /**
     * Retourne la valeur contenue dans cette instance.
     *
     * @return La valeur de type T contenue dans cette instance.
     * @throws ARien Cette exception n'est jamais levée dans cette classe car l'instance contient toujours une valeur.
     */
    public T qQChose() throws ARien{
        return valeur;
    }
}