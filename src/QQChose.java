public class QQChose <T> extends PeutEtre<T> {
    protected T valeur;
    public QQChose( T a_valeur ){
        valeur = a_valeur;
    }
    public boolean estQQChose(){
        return true;
    }
    public boolean estRien(){
        return false;
    }
    public T qQChose() throws ARien{
        return valeur;
    }
}