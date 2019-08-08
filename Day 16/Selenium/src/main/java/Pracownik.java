import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Pracownik {
    private String name;
    private String surname;
    private String firm;
    public Pracownik(String name, String surname, String firm) {
        this.name = name;
        this.surname = surname;
        this.firm = firm;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getFirm() {
        return firm;
    }
    public void setFirm(String firm) {
        this.firm = firm;
    }
    @Override
    public String toString() {
        return "Pracownik{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", firm='" + firm + '\'' +
                '}';
    }
    public static void main(String[] args) {
        List<Pracownik> employees = Arrays.asList(
                new Pracownik("Pawel", "Możdżonek", "HP"),
                new Pracownik("Sundar", "Pihai", "Google"),
                new Pracownik("Zdzislaw", "Pyhon", "Google"),
                new Pracownik("Yevhen", "Zavada", "HP"),
                new Pracownik("Raman", "Hiversky", "HP")
        );
        List<Pracownik> newList =
                employees.stream().sorted(Comparator.comparing(Pracownik::getFirm))
                .collect(Collectors.toList());

        Map<String, List<Pracownik>> anotherNewList =
                employees.stream().collect(Collectors.groupingBy(x -> x.getFirm()));

        Map<String, List<String>> anotherNewList2 =
                employees
                        .stream()
                        .collect(Collectors.groupingBy(x -> x.getFirm(),
                                Collectors.mapping(Pracownik::getName, Collectors.toList())));

        Map<String, Pracownik> anotherNewList3 =
                employees
                        .stream()
                        .collect(Collectors.toMap(Pracownik::getFirm, Function.identity()));

        System.out.println(anotherNewList3.toString());
    }
}