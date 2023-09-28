public class Rien <T> extends PeutEtre<T> {
    public boolean estQQChose(){
        return false;
    }
    public boolean estRien(){
        return true;
    }
    public T qQChose() throws ARien{
        throw new ARien();
    }
}