public interface IDatabase <T>{

    public boolean insert(T data);
    public boolean delete(T data);
    public boolean update(T daya);
    public T select();

}
