package v1.ch6.serviceLoader;

/**
 * @author coofive
 */
public interface Cipher {
    byte[] encrypt(byte[] source, byte[] key);

    byte[] decrypt(byte[] source, byte[] key);

    int strength();
}
