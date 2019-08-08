import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Company {
    private String name;
    private String town;
    public Company(String name, String town) {
        this.name = name;
        this.town = town;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTown() {
        return town;
    }
    public void setTown(String town) {
        this.town = town;
    }
    public static void main(String[] args) {
        List<Company> companies = Arrays.asList(
                new Company("First Data", "Warszawa"),
                new Company( "Sabre", "Kraków"),
                new Company( "Asseco", "Rzeszów"),
                new Company( "Akademia Kodu", "Warszawa"),
                new Company( "IBM", "Warszawa"),
                new Company( "ABB", "Kraków"));
        List<String> names = companies.stream()
                .map(s -> s.getName()).collect(Collectors.toList());
        System.out.println(names);
    }
}
