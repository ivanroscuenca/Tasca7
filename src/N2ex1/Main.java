package N2ex1;

import java.io.IOException;

import static N2ex1.ConvertJson.serializeToJson;

public class Main {
    public static void main(String[] args) throws IOException {

Person p1 = new Person("Juan","Gómez", 39);
        serializeToJson(p1);

    }
}