package N1ex1;


// paràmetre el nombre d'hores treballades i el multiplica pel preu/hora
public abstract class Treballador {
    private String name;
    private String surname;
    private Double priceXhour;

    public Treballador(String name, String surname, Double priceXhour) {
        this.name = name;
        this.surname = surname;
        this.priceXhour = priceXhour;
    }

    public abstract double calculateSalary(int hoursWorked);



    @Override
    public String toString() {
        return "Treballador{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", priceXhour=" + priceXhour +
                '}';
    }
}
