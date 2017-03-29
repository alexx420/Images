/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package images;

import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author rafael.esquivel
 */
public class DecodingBase64 {

    public static byte[] encodeFileToBase64Binary(String base64) {
        return Base64.decodeBase64(base64);
    }

}
