package images;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author rafael.esquivel
 */
public class EncodingBase64 {

    public static String encodeFileToBase64Binary(File file) throws FileNotFoundException, IOException {
        String encodedfile;
        FileInputStream fileInputStreamReader = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        fileInputStreamReader.read(bytes);
        encodedfile = new String(Base64.encodeBase64(bytes), "UTF-8");

        return encodedfile;
    }

}
