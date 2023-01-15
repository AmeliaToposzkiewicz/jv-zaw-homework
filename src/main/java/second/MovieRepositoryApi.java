package second;

public interface MovieRepositoryApi {
    void add(String movie);
    void delete(String movie);
    void findAll();
    void findByTitle(String title);

}
