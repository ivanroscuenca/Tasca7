package N2ex1;

import java.io.*;
public class ConvertJson {
    public static void serializeToJson(Object obj) throws FileNotFoundException {

        //creem un tipus File anomenat directory amb format json
        File directory = new File("/home/ivan/Escritorio/Tasca7/src/N2ex1/exemple.json");
        //Creem objectOutputStream i instanciem un nou objecte
        try {
            ObjectOutputStream writeFile = new ObjectOutputStream(new FileOutputStream(directory));
            //escriure dintre del nou arxiu
//ObjectMapper objectMapper = new ObjectMapper();
            //writeFile.writeObject(directory);
            writeFile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}





