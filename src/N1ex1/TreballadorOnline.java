package N1ex1;

public class TreballadorOnline extends Treballador{


    private String name;
    private String surname;
    private Double priceXhour;
    
    private static final double internet = 100;

    public TreballadorOnline(String name, String surname, Double priceXhour) {
        super(name,surname,priceXhour);
        this.name = name;
        this.surname = surname;
        this.priceXhour = priceXhour;
    }
    @Override
    public double calculateSalary(int hoursWorked ){
        double salary = hoursWorked*priceXhour+internet;
        return salary;
    }

    @Override
    public String toString() {
        return "TreballadorOnline{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", priceXhour=" + priceXhour +
                '}';
    }
}
