package images;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.String.format;

/**
 *
 * @author rafael.esquivel
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {

        //XXX Tarda 2 segundos ejecutando encoding write y decoding write en la pc 
        File f = new File("C:\\Users\\administradorcito\\Documents\\BbvaProjects\\Rest webservice\\ACTA CONSTITUTIVA.PDF");
        String image = EncodingBase64.encodeFileToBase64Binary(f);
        try (FileWriter out = new FileWriter(new File("C:\\Users\\administradorcito\\Documents\\BbvaProjects\\Rest webservice\\ACTA CONSTITUTIVA_base64.txt")); BufferedWriter bw = new BufferedWriter(out)) {
            bw.write(format("{\"base64\":\"%s\"}", image));
            bw.flush();
        }
        byte[] imageBytes = DecodingBase64.encodeFileToBase64Binary(image);
        File outputfile = new File("C:\\Users\\administradorcito\\Documents\\BbvaProjects\\Rest webservice\\ACTA CONSTITUTIVA_base64.pdf");
        try (FileOutputStream fop = new FileOutputStream(outputfile)) {
            fop.write(imageBytes);
            fop.flush();
        }

    }

}
