package day4_stocking_stuffer;

import org.apache.commons.codec.digest.DigestUtils;

import java.security.NoSuchAlgorithmException;

@SuppressWarnings("Duplicates")
public class Part1 {
    private static final String input = "yzbqklnj";

    public static void main(String[] args) throws NoSuchAlgorithmException {
        int i = 0;
        String hash = "nohashhere";
        while(!hash.substring(0, 5).equals("00000")) hash = getHash(i++);
        System.out.println(i - 1);
    }

    private static String getHash(int numIn) {
        return DigestUtils.md5Hex(input + String.valueOf(numIn));
    }
}

