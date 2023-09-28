/**
 * Cette classe abstraite générique représente un type de données qui peut contenir soit une valeur de type T,
 * soit rien du tout.
 *
 * @param <T> Le type de valeur contenu dans cette classe.
 */
public abstract class PeutEtre <T> {

    /**
     * Cette méthode abstraite indique si cette instance contient quelque chose.
     *
     * @return true si cette instance contient quelque chose, sinon false.
     */
    public abstract boolean estQQChose();

    /**
     * Cette méthode abstraite indique si cette instance ne contient rien.
     *
     * @return true si cette instance ne contient rien, sinon false.
     */
    public abstract boolean estRien();

    /**
     * Cette méthode abstraite retourne la valeur contenue dans cette instance, si elle existe.
     * Si cette instance ne contient rien, elle lève une exception de type ARien.
     *
     * @return La valeur de type T contenue dans cette instance.
     * @throws ARien Si cette instance ne contient rien.
     */
    public abstract T qQChose() throws ARien;
}