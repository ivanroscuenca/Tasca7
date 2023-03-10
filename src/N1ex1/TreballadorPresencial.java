package N1ex1;

public class TreballadorPresencial extends Treballador {

    private String name;
    private String surname;
    private Double priceXhour;

    private static final double gas = 200;

    public TreballadorPresencial(String name, String surname, Double priceXhour) {
        super(name,surname,priceXhour);
        this.name = name;
        this.surname = surname;
        this.priceXhour = priceXhour;
    }


    @Override
    public double calculateSalary(int hoursWorked){
        double salary = hoursWorked*priceXhour+gas;
        return salary;
    }

    @Override
    public String toString() {
        return "TreballadorPresencial{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", priceXhour=" + priceXhour +
                '}';
    }

}
