package N1ex2;
//Crea una jerarquia d’objectes amb tres classes:  Treballador, TreballadorOnline i TreballadorPresencial.
//La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode calcularSou() que rep per
// paràmetre el nombre d'hores treballades i el multiplica pel preu/hora. Les classes filles l'han de
// sobreescriure,  emprant @Override.
//Des del main() de la classe Principal, fes les invocacions necessàries per demostrar el funcionament
// de l’anotació @Override.

//En els treballadors presencials, el mètode per calcular el seu sou, rebrà per paràmetre el nombre d’hores
// treballades al mes. A l’hora de calcular el sou es multiplicarà el nombre d’hores treballades pel preu/hora,
// més el valor d'un atribut static anomenat benzina que afegirem en aquesta classe.

//En els treballadors online, el mètode per calcular el seu sou rebrà per paràmetre el nombre d'hores
// treballades al mes. A l'hora de calcular el sou es multiplicarà el nombre d'hores treballades pel
// preu/hora i se li sumarà el preu de la tarifa plana d'Internet, que serà una constant de la classe
// TreballadorOnline.

public class Main {
    @SuppressWarnings("This Calculation is deprecated")
    public static void main(String[] args) {

    TreballadorOnline tr1 = new TreballadorOnline("Alberto", "Pérez", 15.0);
    TreballadorPresencial tr2 = new TreballadorPresencial("Alex", "Vidal", 15.0);

        System.out.println(tr1.toString() + " " +tr1.calculateSalaryDeprecated(200));
        System.out.println(tr2.toString() + " " + tr2.calculateSalaryDeprecated(200));
    }
}

