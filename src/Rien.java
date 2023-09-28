/**
 * Cette classe représente une instance de PeutEtre qui ne contient rien.
 *
 * @param <T> Le type de valeur qui serait contenue dans cette instance si elle contenait quelque chose.
 */
public class Rien <T> extends PeutEtre<T> {

    /**
     * Indique que cette instance ne contient rien.
     *
     * @return true car cette instance ne contient rien.
     */
    public boolean estQQChose(){
        return false;
    }

    /**
     * Indique que cette instance ne contient rien.
     *
     * @return true car cette instance ne contient rien.
     */
    public boolean estRien(){
        return true;
    }

    /**
     * Lève une exception de type ARien pour indiquer qu'il n'y a rien à retourner.
     *
     * @return N/A
     * @throws ARien Cette exception est toujours levée car cette instance ne contient rien.
     */
    public T qQChose() throws ARien{
        throw new ARien();
    }
}